package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = gqf.class)
public final class xpf implements Serializable {
    public static final wpf Companion = new wpf();
    public static final xpf a;
    private static final long serialVersionUID = 0;
    private final ZoneOffset zoneOffset;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        a = new xpf(zoneOffset);
    }

    public xpf(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.zoneOffset = zoneOffset;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new myc(10, this);
    }

    public final int a() {
        return this.zoneOffset.getTotalSeconds();
    }

    public final ZoneOffset b() {
        return this.zoneOffset;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xpf) && pa7.t(this.zoneOffset, ((xpf) obj).zoneOffset);
    }

    public final int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public final String toString() {
        String string = this.zoneOffset.toString();
        string.getClass();
        return string;
    }
}
