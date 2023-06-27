// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \struct dnnl_memory_desc
 *  An opaque structure to describe a memory descriptor. */
@Opaque @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_memory_desc extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public dnnl_memory_desc() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_memory_desc(Pointer p) { super(p); }
}