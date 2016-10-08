package hz.simplejee.json.fastjson;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Hello {

	public static void main(String[] args) {
		System.out.println(JSON.toJSONString(new T(), SerializerFeature.PrettyFormat, SerializerFeature.UseSingleQuotes));
	}
	
	@JSONType(ignores={"date"})
	static class T {
		
		private Date date;
		private long l;
		public T(){
			this.date = new Date();
			this.l = 123L;
		}

		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public long getL() {
			return l;
		}
		public void setL(long l) {
			this.l = l;
		}
		
	}
}
