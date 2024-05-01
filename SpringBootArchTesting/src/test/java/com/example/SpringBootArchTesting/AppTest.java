package com.example.SpringBootArchTesting;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class AppTest {

    @Test
    public void serviceClassesShouldOnlyBeAccessedByControllers() {
        // Define the packages to be scanned
        JavaClasses importedClasses = new ClassFileImporter()
                .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
                .importPackages("com.example.SpringBootArchTesting");

        // Define the ArchUnit rule
        ArchRule myRule = classes()
                .that().resideInAPackage("..service..")
                .should().onlyBeAccessed().byAnyPackage("..controller..");

        // Check if the rule is satisfied
        myRule.check(importedClasses);
    }
}
