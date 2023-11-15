if not exist "allure-results\history" mkdir allure-results\history
xcopy /E /Y allure-report\history\*.* allure-results\history
allure generate allure-results --clean
allure open allure-report 