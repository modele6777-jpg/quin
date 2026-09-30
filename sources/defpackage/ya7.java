package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ya7 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private vt8 unfinishedMessage;
    private boolean wasThrownFromInputStream;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class a extends ya7 {
        private static final long serialVersionUID = 3283890091615336259L;
    }

    public ya7(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public static ya7 b() {
        return new ya7("Protocol message had invalid UTF-8.");
    }

    public static a c() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static ya7 d() {
        return new ya7("CodedInputStream encountered a malformed varint.");
    }

    public static ya7 e() {
        return new ya7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ya7 i() {
        return new ya7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final boolean a() {
        return this.wasThrownFromInputStream;
    }

    public final void g() {
        this.wasThrownFromInputStream = true;
    }

    public final void h(v56 v56Var) {
        this.unfinishedMessage = v56Var;
    }

    public ya7(String str) {
        super(str);
        this.unfinishedMessage = null;
    }
}
