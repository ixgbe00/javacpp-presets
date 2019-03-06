// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #if defined(_MSC_EXTENSIONS)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class _EVENTSFORLOGFILE extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _EVENTSFORLOGFILE(Pointer p) { super(p); }

    public native @Cast("DWORD") int ulSize(); public native _EVENTSFORLOGFILE ulSize(int ulSize);
    public native @Cast("WCHAR") char szLogicalLogFile(int i); public native _EVENTSFORLOGFILE szLogicalLogFile(int i, char szLogicalLogFile);
    @MemberGetter public native @Cast("WCHAR*") CharPointer szLogicalLogFile();        //name of the logical file-security/application/system
    public native @Cast("DWORD") int ulNumRecords(); public native _EVENTSFORLOGFILE ulNumRecords(int ulNumRecords);
    public native @ByRef EVENTLOGRECORD pEventLogRecords(int i); public native _EVENTSFORLOGFILE pEventLogRecords(int i, EVENTLOGRECORD pEventLogRecords);
    @MemberGetter public native EVENTLOGRECORD pEventLogRecords();
}