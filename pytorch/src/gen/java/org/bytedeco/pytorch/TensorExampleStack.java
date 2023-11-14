// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** A {@code Collation} for {@code Example<Tensor, NoTarget>} types that stacks all data
 *  tensors into one tensor. */
@Name("torch::data::transforms::Stack<torch::data::TensorExample>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorExampleStack extends TensorExampleCollation {
    static { Loader.load(); }
    /** Default native constructor. */
    public TensorExampleStack() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorExampleStack(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorExampleStack(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TensorExampleStack position(long position) {
        return (TensorExampleStack)super.position(position);
    }
    @Override public TensorExampleStack getPointer(long i) {
        return new TensorExampleStack((Pointer)this).offsetAddress(i);
    }

  public native @ByVal @Cast("torch::data::TensorExample*") Example apply_batch(@Cast("torch::data::TensorExample*") @StdVector Example examples);
}