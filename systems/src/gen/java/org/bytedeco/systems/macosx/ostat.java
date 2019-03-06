// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
/*
 * XXX So deprecated, it would make your head spin
 *
 * The old stat structure.  In fact, this is not used by the kernel at all,
 * and should not be used by user space, and should be removed from this
 * header file entirely (along with the unused cvtstat() prototype in
 * vnode_internal.h).
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class ostat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ostat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ostat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ostat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ostat position(long position) {
        return (ostat)super.position(position);
    }

	public native @Cast("__uint16_t") short st_dev(); public native ostat st_dev(short st_dev);		/* inode's device */
	public native @Cast("ino_t") long st_ino(); public native ostat st_ino(long st_ino);		/* inode's number */
	public native @Cast("mode_t") short st_mode(); public native ostat st_mode(short st_mode);	/* inode protection mode */
	public native @Cast("nlink_t") short st_nlink(); public native ostat st_nlink(short st_nlink);	/* number of hard links */
	public native @Cast("__uint16_t") short st_uid(); public native ostat st_uid(short st_uid);		/* user ID of the file's owner */
	public native @Cast("__uint16_t") short st_gid(); public native ostat st_gid(short st_gid);		/* group ID of the file's group */
	public native @Cast("__uint16_t") short st_rdev(); public native ostat st_rdev(short st_rdev);	/* device type */
	public native @Cast("__int32_t") int st_size(); public native ostat st_size(int st_size);	/* file size, in bytes */
	public native @ByRef timespec st_atimespec(); public native ostat st_atimespec(timespec st_atimespec);	/* time of last access */
	public native @ByRef timespec st_mtimespec(); public native ostat st_mtimespec(timespec st_mtimespec);	/* time of last data modification */
	public native @ByRef timespec st_ctimespec(); public native ostat st_ctimespec(timespec st_ctimespec);	/* time of last file status change */
	public native @Cast("__int32_t") int st_blksize(); public native ostat st_blksize(int st_blksize);	/* optimal blocksize for I/O */
	public native @Cast("__int32_t") int st_blocks(); public native ostat st_blocks(int st_blocks);	/* blocks allocated for file */
	public native @Cast("__uint32_t") int st_flags(); public native ostat st_flags(int st_flags);	/* user defined flags for file */
	public native @Cast("__uint32_t") int st_gen(); public native ostat st_gen(int st_gen);		/* file generation number */
}