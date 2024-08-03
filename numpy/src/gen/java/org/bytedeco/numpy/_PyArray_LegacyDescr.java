// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


// #else  /* 1.x and 2.x compatible version (only shared fields): */

// #endif  /* 1.x and 2.x compatible version */

/*
 * Semi-private struct with additional field of legacy descriptors (must
 * check NPY_DT_is_legacy before casting/accessing).  The struct is also not
 * valid when running on 1.x (i.e. in public API use).
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class _PyArray_LegacyDescr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyArray_LegacyDescr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyArray_LegacyDescr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyArray_LegacyDescr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyArray_LegacyDescr position(long position) {
        return (_PyArray_LegacyDescr)super.position(position);
    }
    @Override public _PyArray_LegacyDescr getPointer(long i) {
        return new _PyArray_LegacyDescr((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native _PyArray_LegacyDescr ob_base(PyObject setter);
        public native PyTypeObject typeobj(); public native _PyArray_LegacyDescr typeobj(PyTypeObject setter);
        public native @Cast("char") byte kind(); public native _PyArray_LegacyDescr kind(byte setter);
        public native @Cast("char") byte type(); public native _PyArray_LegacyDescr type(byte setter);
        public native @Cast("char") byte byteorder(); public native _PyArray_LegacyDescr byteorder(byte setter);
        public native @Cast("char") byte _former_flags(); public native _PyArray_LegacyDescr _former_flags(byte setter);
        public native int type_num(); public native _PyArray_LegacyDescr type_num(int setter);
        public native @Cast("npy_uint64") long flags(); public native _PyArray_LegacyDescr flags(long setter);
        public native @Cast("npy_intp") long elsize(); public native _PyArray_LegacyDescr elsize(long setter);
        public native @Cast("npy_intp") long alignment(); public native _PyArray_LegacyDescr alignment(long setter);
        public native PyObject metadata(); public native _PyArray_LegacyDescr metadata(PyObject setter);
        public native @Cast("npy_hash_t") long hash(); public native _PyArray_LegacyDescr hash(long setter);
        public native Pointer reserved_null(int i); public native _PyArray_LegacyDescr reserved_null(int i, Pointer setter);
        @MemberGetter public native @Cast("void**") PointerPointer reserved_null();
        public native PyArray_ArrayDescr subarray(); public native _PyArray_LegacyDescr subarray(PyArray_ArrayDescr setter);
        public native PyObject fields(); public native _PyArray_LegacyDescr fields(PyObject setter);
        public native PyObject names(); public native _PyArray_LegacyDescr names(PyObject setter);
        public native NpyAuxData c_metadata(); public native _PyArray_LegacyDescr c_metadata(NpyAuxData setter);
}