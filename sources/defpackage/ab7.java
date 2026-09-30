package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ab7 extends IOException {
    private ut8 unfinishedMessage;

    public ab7(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static ab7 c() {
        return new ab7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final ut8 a() {
        return this.unfinishedMessage;
    }

    public final void b(ut8 ut8Var) {
        this.unfinishedMessage = ut8Var;
    }
}
