package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dzb implements Serializable {
    public final Throwable exception;

    public dzb(Throwable th) {
        th.getClass();
        this.exception = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dzb) && pa7.t(this.exception, ((dzb) obj).exception);
    }

    public final int hashCode() {
        return this.exception.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.exception + ')';
    }
}
