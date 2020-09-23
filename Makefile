all: generate_doc compile clean
generate_doc:
	xcopy /s src tmp
	javadoc tmp/com/samthegitguy/webpack/*.java -d docs 
compile: 
	javac src/com/samthegitguy/webpack/*.java -d bin/class
	-jar vcf webpack.jar -C bin/class/* . -C docs . -C assets .
clean: 
	rd /s tmp 

