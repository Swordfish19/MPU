@echo off
cls
thrift-0.9.2.exe -out "src/main/java" -gen java thrift.service 
if not errorlevel 1 echo file generation successfull