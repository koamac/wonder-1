/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb;

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.directtoweb.*;
import er.extensions.ERXExceptionHolder;
import er.extensions.ERXLogger;

// Useful component and important bug fix
// Fixes validation failures being propogated
// Adds valueForBinding that resolves in the d2wContext.

public class ERD2WCustomQueryComponentWithArgs extends ERDCustomQueryComponent implements ERXExceptionHolder {

    public ERD2WCustomQueryComponentWithArgs(WOContext context) {
        super(context);
    }
    
    /** logging support */
    public final static ERXLogger log = ERXLogger.getERXLogger(ERD2WCustomQueryComponentWithArgs.class);
    
}