package com.sevlow.sdk.tim.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Element
 * @Package com.sevlow.sdk.tim.bean
 * @date 2019-05-27 19:40
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AddBlockAccountsResult extends BatchUpdateResult implements Serializable {

	private static final long serialVersionUID = -8119104657667342684L;

}
