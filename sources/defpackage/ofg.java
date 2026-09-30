package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ofg {
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;

    public ofg(int i, String str, long j, long j2, int i2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofg) {
            ofg ofgVar = (ofg) obj;
            if (this.a == ofgVar.a) {
                String str = ofgVar.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c == ofgVar.c && this.d == ofgVar.d && this.e == ofgVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.d;
        long j2 = this.c;
        return this.e ^ ((((((iHashCode ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
        sb.append(this.a);
        sb.append(", filePath=");
        sb.append(this.b);
        sb.append(", fileOffset=");
        sb.append(this.c);
        sb.append(", remainingBytes=");
        sb.append(this.d);
        sb.append(", previousChunk=");
        return tec.g(this.e, "}", sb);
    }
}
