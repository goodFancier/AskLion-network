package com.messager.Model.ORM;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public abstract class ORMDto implements Serializable
{
		@Id
		@Column(name = "RecID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		protected Long recID;

		public Long getRecID()
		{
				return recID;
		}

		public void setRecID(Long recID)
		{
				this.recID = recID;
		}
}
