package com.lab3.admiterator;

import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AdmiteratorTest {

	@Test
	@Parameters(method = "admit")
	public void admitTest(Type speed, Type accuracy) {
		fail("Not yet implemented");
	}
	
	private Object admit() {
		return new Object [][]{{arg1_run1, arg2_run1}, 
				{arg1_run2, arg2_run2} };
		}
	}

}
