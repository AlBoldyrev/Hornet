package io.hornet.repository;

import java.util.*;

import io.hornet.entity.*;
import org.springframework.data.jpa.repository.*;

public interface WordTranslationRepository extends JpaRepository<WordTranslationEntity, UUID> {
}
