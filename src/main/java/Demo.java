public class Demo {



        public  String[] SortArray (String[]input){

            String[] result = new String[input.length];

            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input.length - 1 - i; j++) {
                    if (input[j].length() > input[j + 1].length()) {

                        String temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    } else if (input[j].length() == input[j + 1].length()
                            && input[j].compareTo(input[j + 1]) > 0) {
                        String temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    }

                }
                //sort by ascii
            }
            //System.out.println(input);
            /*            else if (result[i].length() < result[i+1].length()){}*/
            return input;

        }
    }
