package com.mura.usecase


/**
 * String compressor to read the string value and to compress it based on the minimum occurrency provided as part
 * of the input parameters.
 * @param checkes for a String followed by an Integer
 * @author Muralidhar Rada
 * @since 21/05/2018
 */

object StringCompressor {

	def compressStr(input:String, minOccurency:Int){

	  /* Function works in recursive model to slice the input string character by character and comparing with previous character
	   * to look for consective occrrances and compress those.
	   */
		def compress(counter: Int, last: String, inputString: String, num: Int): String = {
		  // initialize temp variable to blank
				var  temp = ""
						if (inputString.length() == 0) { // to check the last char of the input string
							if (counter >= num) {
								if(counter>1){           // to compress only those chars that are repeated
									counter.toString + last ;
								}
								else last;
							} else {
								for (i <- 1 to counter) temp = temp + last
										temp;
							}
						} else {                  // slice and compare   
							val sliced = inputString.slice(1, inputString.length());
							val current = inputString(0).toString;
							if (last == current) {
								compress(counter + 1, current, sliced, num);
							} else if (counter >= num) {
								if(counter>1){          // to compress only those chars that are repeated
									counter.toString + last + compress(1, current, sliced, num);
								}
								else last + compress(1, current, sliced, num);
							} else {
								for (i <- 1 to counter) temp = temp + last
										temp + compress(1, current, sliced, num);
							}
						}
		}

		println(compress(0, "", input,minOccurency));

	}


	def main(args: Array[String]) { // validations and function call
		if (args.length != 2) {
			println("Enter 2 input parameters in the form of a Message and Number")
			return 
		} 

		try {
			val input = args(0)
					val minOccurency = args(1).toInt
					compressStr(input, minOccurency)
		} catch {
		case e: Exception => println("Second parameter is not an Integer")
				return
		}       
	}
}
