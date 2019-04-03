package org4.weixin.domain.shortvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import org4.weixin.domain.InMessage;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class ShortvideoInMessage extends InMessage{
	
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String mediaId;
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String thumbMediaId;
	

	public ShortvideoInMessage() {
		super.setMsgType("shortvideo");
	}


	public String getMediaId() {
		return mediaId;
	}


	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}


	public String getThumbMediaId() {
		return thumbMediaId;
	}


	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}


	@Override
	public String toString() {
		return "ShortvideoInMessage [mediaId=" + mediaId + ", thumbMediaId=" + thumbMediaId + ", getMediaId()="
				+ getMediaId() + ", getThumbMediaId()=" + getThumbMediaId() + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
