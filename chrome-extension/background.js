chrome.runtime.onInstalled.addListener(() => {
    chrome.contextMenus.create({
        id: "add-to-hornet",
        title: "Добавить в Hornet",
        contexts: ["selection"]
    });
});

chrome.contextMenus.onClicked.addListener(async (info, tab) => {
    if (info.menuItemId === "add-to-hornet" && info.selectionText) {
        const word = info.selectionText.trim();

        const response = await fetch("http://localhost:8080/api/words", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ value: word })
        });

        if (!response.ok) {
            console.error("Failed to add word to Hornet:", await response.text());
        } else {
            console.log(`Word "${word}" added successfully.`);
        }
    }
});
