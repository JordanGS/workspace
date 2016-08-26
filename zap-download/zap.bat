if exist "%HOMEPATH%\OWASP ZAP\.ZAP_JVM.properties" (
	set /p jvmopts=< "%HOMEPATH%\OWASP ZAP\.ZAP_JVM.properties"
) else (
	set jvmopts=-Xmx512m
)

java %jvmopts% -jar zap-D-2016-08-25.jar %*
