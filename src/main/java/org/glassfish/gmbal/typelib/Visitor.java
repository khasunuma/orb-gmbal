/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.gmbal.typelib;

/**
 *
 * @author ken
 */
public interface Visitor<R> {
    R visitEvaluatedType( EvaluatedType et ) ;
    
    R visitEvaluatedArrayType( EvaluatedArrayType eat ) ;
    
    R visitEvaluatedDeclaration( EvaluatedDeclaration ed ) ;
    
    R visitEvaluatedClassDeclaration( EvaluatedClassDeclaration ecd ) ;

    R visitEvaluatedFieldDeclaration( EvaluatedFieldDeclaration efd ) ;

    R visitEvaluatedMethodDeclaration( EvaluatedMethodDeclaration emd ) ;
}
