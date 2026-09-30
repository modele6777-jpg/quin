package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w6f {
    public final String a;
    public final d6f b;
    public final long c;
    public final long d;
    public final long e;

    public /* synthetic */ w6f(String str, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? d6f.a : d6f.b, 0L, 0L, 0L);
    }

    public static w6f a(w6f w6fVar, d6f d6fVar, long j, long j2, long j3, int i) {
        d6f d6fVar2 = d6fVar;
        String str = w6fVar.a;
        if ((i & 2) != 0) {
            d6fVar2 = w6fVar.b;
        }
        if ((i & 4) != 0) {
            j = w6fVar.c;
        }
        if ((i & 8) != 0) {
            j2 = w6fVar.d;
        }
        if ((i & 16) != 0) {
            j3 = w6fVar.e;
        }
        w6fVar.getClass();
        d6fVar2.getClass();
        long j4 = j;
        return new w6f(str, d6fVar2, j4, j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6f)) {
            return false;
        }
        w6f w6fVar = (w6f) obj;
        return pa7.t(this.a, w6fVar.a) && this.b == w6fVar.b && this.c == w6fVar.c && this.d == w6fVar.d && this.e == w6fVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.e) + ib8.b(ib8.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TtsPlaybackState(chatId=");
        sb.append(this.a);
        sb.append(", buttonState=");
        sb.append(this.b);
        sb.append(", currentPositionMs=");
        sb.append(this.c);
        sb.append(", bufferedPositionMs=");
        sb.append(this.d);
        sb.append(", durationMs=");
        return tec.h(this.e, ")", sb);
    }

    public w6f(String str, d6f d6fVar, long j, long j2, long j3) {
        d6fVar.getClass();
        this.a = str;
        this.b = d6fVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
