chrome.runtime.onInstalled.addListener(() => {
    chrome.contextMenus.create({
        id: "add-to-hornet",
        title: "Добавить в Hornet",
        contexts: ["selection"]
    });
});

chrome.contextMenus.onClicked.addListener(async (info, tab) => {
    if (info.menuItemId === "add-to-hornet" && info.selectionText) {
        try {
            const response = await fetch("http://localhost:8080/api/words", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ value: info.selectionText })
            });

            if (!response.ok) {
                console.error("Failed to add word");
            }
        } catch (err) {
            console.error("Error sending word:", err);
        }
    }
});
