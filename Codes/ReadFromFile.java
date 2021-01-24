//method to read each line of a file and store them into a list

public List<String> readFileData() throws IOException{
		
    List<String> lines = new ArrayList<String>();
		
    try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			//skip the first line
			br.readLine();
      
			String line = null;
      // advance to the second line
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		}
	    return lines;
	}
