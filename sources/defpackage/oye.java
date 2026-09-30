package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oye implements Parcelable {
    public static final Parcelable.Creator<oye> CREATOR = new rz9(11);
    public long a;
    public long b;

    public oye() {
        this(e(), a());
    }

    public static long a() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public static long e() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public final long b() {
        return new oye().b - this.b;
    }

    public final long c(oye oyeVar) {
        return oyeVar.b - this.b;
    }

    public final void d() {
        this.a = e();
        this.b = a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public oye(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
