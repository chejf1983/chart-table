REM 声明采用UTF-8编码
chcp 65001

del .\*.jar

@echo off
echo copy jfreechart图表开发包
copy ..\..\..\lib\jfreechart-1.0.19\lib\jcommon-1.0.23.jar .\
copy ..\..\..\lib\jfreechart-1.0.19\lib\jfreechart-1.0.19.jar .\
copy ..\..\..\lib\jfreechart-1.0.19\lib\jfreechart-1.0.19-swt.jar .\

echo copy 自定义平台开发包
copy ..\..\..\PlatForm\commonbean\dist\commonbean.jar .\

pause