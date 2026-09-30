package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ezb implements Serializable {
    private final Object value;

    public /* synthetic */ ezb(Object obj) {
        this.value = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof dzb) {
            return ((dzb) obj).exception;
        }
        return null;
    }

    public final /* synthetic */ Object b() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ezb) && pa7.t(this.value, ((ezb) obj).value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.value;
        if (obj instanceof dzb) {
            return ((dzb) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
