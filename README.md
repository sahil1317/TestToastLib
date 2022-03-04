# TestToastLib


![example workflow](https://img.shields.io/date/1646393790)
![](https://img.shields.io/github/v/release/sahil1317/TestToastLib?display_name=tag)

**Steps**

1.**Add it in your root build.gradle at the end of repositories:**

       allprojects {
      
		repositories {
		
			...
			maven { url 'https://jitpack.io' }
		}
	   }
  
2. **Add the dependency**

         dependencies {
      
	        implementation 'com.github.sahil1317:TestToastLib:Tag'
		 }
	
3. **Use It**


             ToastMe(this).text("Hello ").show()
