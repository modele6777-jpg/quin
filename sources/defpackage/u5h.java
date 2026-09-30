package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u5h extends v4 implements Comparable {
    public static final Parcelable.Creator<u5h> CREATOR = new s5h(1);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int v;
    public final int w;

    public u5h(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.v = i2;
        this.w = i3;
    }

    public final void c(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.e;
            oa7.A(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f;
            oa7.A(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(")");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        u5h u5hVar = (u5h) obj;
        int iCompareTo = this.a.compareTo(u5hVar.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = u5hVar.g;
        int i3 = this.g;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.b;
            long j2 = u5hVar.b;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = u5hVar.c;
            boolean z2 = this.c;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.d, u5hVar.d);
        }
        if (i3 == 4) {
            String str = u5hVar.e;
            String str2 = this.e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            qc0.i(ub3.h(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
            return 0;
        }
        byte[] bArr = u5hVar.f;
        byte[] bArr2 = this.f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u5h) {
            u5h u5hVar = (u5h) obj;
            if (hfc.s(this.a, u5hVar.a)) {
                int i = u5hVar.g;
                int i2 = this.g;
                if (i2 == i && this.v == u5hVar.v && this.w == u5hVar.w) {
                    if (i2 == 1) {
                        return this.b == u5hVar.b;
                    }
                    if (i2 == 2) {
                        return this.c == u5hVar.c;
                    }
                    if (i2 == 3) {
                        return this.d == u5hVar.d;
                    }
                    if (i2 == 4) {
                        return hfc.s(this.e, u5hVar.e);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f, u5hVar.f);
                    }
                    qc0.i(ub3.h(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        boolean z = str == null;
        int iB = hcc.B(parcel, 20293);
        if (!z) {
            hcc.v(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            hcc.z(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.c) {
            hcc.z(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.d;
        if (d != 0.0d) {
            hcc.z(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.e;
        if (str2 != null) {
            hcc.v(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            hcc.q(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (i2 != 0) {
            hcc.z(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.v;
        if (i3 != 0) {
            hcc.z(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.w;
        if (i4 != 0) {
            hcc.z(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        hcc.C(parcel, iB);
    }
}
