package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = pd8.class)
public final class kd8 implements Comparable<kd8>, Serializable {
    public static final jd8 Companion = new jd8();
    private static final long serialVersionUID = 0;
    private final LocalTime value;

    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new kd8(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new kd8(localTime2);
    }

    public kd8(int i, int i2, int i3, int i4) {
        try {
            LocalTime localTimeOf = LocalTime.of(i, i2, i3, i4);
            localTimeOf.getClass();
            this.value = localTimeOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new myc(3, this);
    }

    public final LocalTime a() {
        return this.value;
    }

    public final long b() {
        return this.value.toNanoOfDay();
    }

    @Override // java.lang.Comparable
    public final int compareTo(kd8 kd8Var) {
        kd8 kd8Var2 = kd8Var;
        kd8Var2.getClass();
        return this.value.compareTo(kd8Var2.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kd8) && pa7.t(this.value, ((kd8) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public kd8(LocalTime localTime) {
        localTime.getClass();
        this.value = localTime;
    }
}
