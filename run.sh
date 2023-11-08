cd src
javac App.java -d output
jar -cfvm file.jar manifest.txt -C output .