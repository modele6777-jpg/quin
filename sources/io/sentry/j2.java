package io.sentry;

import defpackage.je9;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements l3 {
    public final io.sentry.vendor.gson.stream.a a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 0;

    public j2(Reader reader) {
        this.a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.l3
    public final Object A0(z0 z0Var, y1 y1Var) {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return y1Var.a(this, z0Var);
        }
        u();
        return null;
    }

    @Override // io.sentry.l3
    public final Integer B() {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(nextInt());
        }
        u();
        return null;
    }

    @Override // io.sentry.l3
    public final Object D0() {
        h2 h2Var = new h2();
        boolean zB = false;
        while (!zB) {
            int[] iArr = a2.a;
            io.sentry.vendor.gson.stream.a aVar = this.a;
            int i = iArr[aVar.peek().ordinal()];
            ArrayList arrayList = h2Var.a;
            switch (i) {
                case 1:
                    beginArray();
                    arrayList.add(new d2());
                    break;
                case 2:
                    endArray();
                    zB = h2Var.b();
                    break;
                case 3:
                    beginObject();
                    arrayList.add(new e2());
                    break;
                case 4:
                    endObject();
                    zB = h2Var.b();
                    break;
                case 5:
                    arrayList.add(new f2(aVar.nextName()));
                    break;
                case 6:
                    zB = h2Var.c(new z1(this, 0));
                    break;
                case 7:
                    zB = h2Var.c(new z1(h2Var, this));
                    break;
                case 8:
                    zB = h2Var.c(new z1(this, 2));
                    break;
                case 9:
                    u();
                    zB = h2Var.c(new com.adjust.sdk.sig.r3(4));
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    zB = true;
                    break;
            }
        }
        c2 c2VarA = h2Var.a();
        if (c2VarA != null) {
            return c2VarA.getValue();
        }
        return null;
    }

    @Override // io.sentry.l3
    public final void F(z0 z0Var, AbstractMap abstractMap, String str) throws Throwable {
        i2 i2Var = null;
        try {
            try {
                i2 i2Var2 = new i2(this.c, this.a.peek());
                this.b.addLast(i2Var2);
                try {
                    abstractMap.put(str, D0());
                    b(i2Var2);
                } catch (Exception e) {
                    e = e;
                    i2Var = i2Var2;
                    z0Var.c(q5.ERROR, e, "Error deserializing unknown key: %s", str);
                    if (i2Var != null) {
                        try {
                            x(i2Var);
                        } catch (Exception e2) {
                            z0Var.d(q5.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e2);
                        }
                    }
                    b(i2Var);
                } catch (Throwable th) {
                    th = th;
                    i2Var = i2Var2;
                    b(i2Var);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.sentry.l3
    public final Long H() {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(nextLong());
        }
        u();
        return null;
    }

    @Override // io.sentry.l3
    public final TimeZone M(z0 z0Var) {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            u();
            return null;
        }
        try {
            return TimeZone.getTimeZone(nextString());
        } catch (Exception e) {
            z0Var.d(q5.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // io.sentry.l3
    public final ArrayList N0(z0 z0Var, y1 y1Var) {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            u();
            return null;
        }
        beginArray();
        ArrayList arrayList = new ArrayList();
        while (aVar.hasNext()) {
            i2 i2Var = new i2(this.c, aVar.peek());
            this.b.addLast(i2Var);
            try {
                try {
                    arrayList.add(y1Var.a(this, z0Var));
                } catch (Exception e) {
                    z0Var.d(q5.WARNING, "Failed to deserialize object in list.", e);
                    try {
                        x(i2Var);
                        z = true;
                    } catch (Exception e2) {
                        z0Var.d(q5.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
                        z = false;
                    }
                    if (!z) {
                        b(i2Var);
                        endArray();
                        return arrayList;
                    }
                }
                b(i2Var);
            } catch (Throwable th) {
                b(i2Var);
                throw th;
            }
        }
        endArray();
        return arrayList;
    }

    @Override // io.sentry.l3
    public final String O() {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return nextString();
        }
        u();
        return null;
    }

    @Override // io.sentry.l3
    public final HashMap P(z0 z0Var, y1 y1Var) {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            u();
            return null;
        }
        beginObject();
        HashMap map = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                String strNextName = aVar.nextName();
                i2 i2Var = new i2(this.c, aVar.peek());
                this.b.addLast(i2Var);
                try {
                    try {
                        map.put(strNextName, y1Var.a(this, z0Var));
                    } catch (Exception e) {
                        z0Var.d(q5.WARNING, "Failed to deserialize object in map.", e);
                        try {
                            x(i2Var);
                            z = true;
                        } catch (Exception e2) {
                            z0Var.d(q5.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
                            z = false;
                        }
                        if (!z) {
                            b(i2Var);
                            break;
                        }
                        endObject();
                        return map;
                    }
                    b(i2Var);
                    if (aVar.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && aVar.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                } catch (Throwable th) {
                    b(i2Var);
                    throw th;
                }
            }
        }
        endObject();
        return map;
    }

    public final void b(i2 i2Var) {
        if (i2Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty() || arrayDeque.peekLast() != i2Var) {
            arrayDeque.remove(i2Var);
        } else {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.l3
    public final void beginArray() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH != 3) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(aVar.peek());
            com.adjust.sdk.sig.r3.k(sb, aVar.x());
        } else {
            aVar.R(1);
            aVar.Z[aVar.X - 1] = 0;
            aVar.v = 0;
            h();
            this.c++;
        }
    }

    @Override // io.sentry.l3
    public final void beginObject() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH != 1) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(aVar.peek());
            com.adjust.sdk.sig.r3.k(sb, aVar.x());
        } else {
            aVar.R(3);
            aVar.v = 0;
            h();
            this.c++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // io.sentry.l3
    public final Double e0() {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(nextDouble());
        }
        u();
        return null;
    }

    @Override // io.sentry.l3
    public final void endArray() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(aVar.peek());
            com.adjust.sdk.sig.r3.k(sb, aVar.x());
            return;
        }
        int i = aVar.X;
        aVar.X = i - 1;
        int[] iArr = aVar.Z;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        aVar.v = 0;
        this.c--;
    }

    @Override // io.sentry.l3
    public final void endObject() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(aVar.peek());
            com.adjust.sdk.sig.r3.k(sb, aVar.x());
            return;
        }
        int i = aVar.X;
        int i2 = i - 1;
        aVar.X = i2;
        aVar.Y[i2] = null;
        int[] iArr = aVar.Z;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        aVar.v = 0;
        this.c--;
    }

    public final void h() {
        i2 i2Var = (i2) this.b.peekLast();
        if (i2Var != null) {
            i2Var.c = true;
        }
    }

    @Override // io.sentry.l3
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final boolean l() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        boolean z = false;
        if (iH == 5) {
            aVar.v = 0;
            int[] iArr = aVar.Z;
            int i = aVar.X - 1;
            iArr[i] = iArr[i] + 1;
            z = true;
        } else {
            if (iH != 6) {
                StringBuilder sb = new StringBuilder("Expected a boolean but was ");
                sb.append(aVar.peek());
                com.adjust.sdk.sig.r3.k(sb, aVar.x());
                return false;
            }
            aVar.v = 0;
            int[] iArr2 = aVar.Z;
            int i2 = aVar.X - 1;
            iArr2[i2] = iArr2[i2] + 1;
        }
        h();
        return z;
    }

    @Override // io.sentry.l3
    public final double nextDouble() {
        double dNextDouble = this.a.nextDouble();
        h();
        return dNextDouble;
    }

    @Override // io.sentry.l3
    public final float nextFloat() {
        double dNextDouble = this.a.nextDouble();
        h();
        return (float) dNextDouble;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    @Override // io.sentry.l3
    public final int nextInt() {
        String strG;
        int i;
        double d;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH == 15) {
            long j = aVar.w;
            i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + aVar.w + aVar.x());
            }
            aVar.v = 0;
            int[] iArr = aVar.Z;
            int i2 = aVar.X - 1;
            iArr[i2] = iArr[i2] + 1;
        } else {
            if (iH == 16) {
                aVar.y = new String(aVar.c, aVar.d, aVar.x);
                aVar.d += aVar.x;
            } else {
                if (iH != 8 && iH != 9 && iH != 10) {
                    StringBuilder sb = new StringBuilder("Expected an int but was ");
                    sb.append(aVar.peek());
                    com.adjust.sdk.sig.r3.k(sb, aVar.x());
                    return 0;
                }
                if (iH == 10) {
                    strG = aVar.N();
                    aVar.y = strG;
                } else {
                    strG = aVar.G(iH == 8 ? '\'' : '\"');
                    aVar.y = strG;
                }
                try {
                    i = Integer.parseInt(strG);
                    aVar.v = 0;
                    int[] iArr2 = aVar.Z;
                    int i3 = aVar.X - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                } catch (NumberFormatException unused) {
                    aVar.v = 11;
                    d = Double.parseDouble(aVar.y);
                    i = (int) d;
                    if (i == d) {
                        com.adjust.sdk.sig.r3.h(aVar.y, aVar.x(), "Expected an int but was ");
                        return 0;
                    }
                    aVar.y = null;
                    aVar.v = 0;
                    int[] iArr3 = aVar.Z;
                    int i4 = aVar.X - 1;
                    iArr3[i4] = iArr3[i4] + 1;
                }
            }
            aVar.v = 11;
            d = Double.parseDouble(aVar.y);
            i = (int) d;
            if (i == d) {
                com.adjust.sdk.sig.r3.h(aVar.y, aVar.x(), "Expected an int but was ");
                return 0;
            }
            aVar.y = null;
            aVar.v = 0;
            int[] iArr4 = aVar.Z;
            int i5 = aVar.X - 1;
            iArr4[i5] = iArr4[i5] + 1;
        }
        h();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    @Override // io.sentry.l3
    public final long nextLong() {
        String strG;
        long j;
        double d;
        long j2;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH == 15) {
            aVar.v = 0;
            int[] iArr = aVar.Z;
            int i = aVar.X - 1;
            iArr[i] = iArr[i] + 1;
            j = aVar.w;
        } else {
            if (iH == 16) {
                aVar.y = new String(aVar.c, aVar.d, aVar.x);
                aVar.d += aVar.x;
            } else {
                if (iH != 8 && iH != 9 && iH != 10) {
                    StringBuilder sb = new StringBuilder("Expected a long but was ");
                    sb.append(aVar.peek());
                    com.adjust.sdk.sig.r3.k(sb, aVar.x());
                    return 0L;
                }
                if (iH == 10) {
                    strG = aVar.N();
                    aVar.y = strG;
                } else {
                    strG = aVar.G(iH == 8 ? '\'' : '\"');
                    aVar.y = strG;
                }
                try {
                    long j3 = Long.parseLong(strG);
                    aVar.v = 0;
                    int[] iArr2 = aVar.Z;
                    int i2 = aVar.X - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    j = j3;
                } catch (NumberFormatException unused) {
                    aVar.v = 11;
                    d = Double.parseDouble(aVar.y);
                    j2 = (long) d;
                    if (j2 == d) {
                        com.adjust.sdk.sig.r3.h(aVar.y, aVar.x(), "Expected a long but was ");
                        return 0L;
                    }
                    aVar.y = null;
                    aVar.v = 0;
                    int[] iArr3 = aVar.Z;
                    int i3 = aVar.X - 1;
                    iArr3[i3] = iArr3[i3] + 1;
                    j = j2;
                }
            }
            aVar.v = 11;
            d = Double.parseDouble(aVar.y);
            j2 = (long) d;
            if (j2 == d) {
                com.adjust.sdk.sig.r3.h(aVar.y, aVar.x(), "Expected a long but was ");
                return 0L;
            }
            aVar.y = null;
            aVar.v = 0;
            int[] iArr4 = aVar.Z;
            int i4 = aVar.X - 1;
            iArr4[i4] = iArr4[i4] + 1;
            j = j2;
        }
        h();
        return j;
    }

    @Override // io.sentry.l3
    public final String nextName() {
        return this.a.nextName();
    }

    @Override // io.sentry.l3
    public final String nextString() {
        String str;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH == 10) {
            str = aVar.N();
        } else if (iH == 8) {
            str = aVar.G('\'');
        } else if (iH == 9) {
            str = aVar.G('\"');
        } else if (iH == 11) {
            str = aVar.y;
            aVar.y = null;
        } else if (iH == 15) {
            str = Long.toString(aVar.w);
        } else {
            if (iH != 16) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(aVar.peek());
                com.adjust.sdk.sig.r3.k(sb, aVar.x());
                return null;
            }
            str = new String(aVar.c, aVar.d, aVar.x);
            aVar.d += aVar.x;
        }
        aVar.v = 0;
        int[] iArr = aVar.Z;
        int i = aVar.X - 1;
        iArr[i] = iArr[i] + 1;
        h();
        return str;
    }

    @Override // io.sentry.l3
    public final Date o0(z0 z0Var) {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            u();
            return null;
        }
        String strNextString = nextString();
        if (strNextString == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.l(strNextString);
            } catch (Exception unused) {
                return io.sentry.config.a.m(strNextString);
            }
        } catch (Exception e) {
            z0Var.d(q5.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    @Override // io.sentry.l3
    public final io.sentry.vendor.gson.stream.b peek() {
        return this.a.peek();
    }

    @Override // io.sentry.l3
    public final Boolean r0() {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(l());
        }
        u();
        return null;
    }

    @Override // io.sentry.l3
    public final void setLenient(boolean z) {
        this.a.b = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // io.sentry.l3
    public final void skipValue() {
        io.sentry.vendor.gson.stream.a aVar;
        int i = 0;
        do {
            aVar = this.a;
            int iH = aVar.v;
            if (iH == 0) {
                iH = aVar.h();
            }
            if (iH == 3) {
                aVar.R(1);
            } else {
                if (iH == 1) {
                    aVar.R(3);
                } else if (iH == 4 || iH == 2) {
                    aVar.X--;
                    i--;
                } else if (iH == 14 || iH == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = aVar.d + i2;
                            if (i3 < aVar.e) {
                                char c = aVar.c[i3];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    aVar.b();
                                }
                                aVar.d += i2;
                            } else {
                                aVar.d = i3;
                                if (!aVar.l(1)) {
                                }
                            }
                        }
                    }
                } else if (iH == 8 || iH == 12) {
                    aVar.W('\'');
                } else if (iH == 9 || iH == 13) {
                    aVar.W('\"');
                } else if (iH == 16) {
                    aVar.d += aVar.x;
                }
                aVar.v = 0;
            }
            i++;
            aVar.v = 0;
        } while (i != 0);
        int[] iArr = aVar.Z;
        int i4 = aVar.X - 1;
        iArr[i4] = iArr[i4] + 1;
        aVar.Y[i4] = "null";
        h();
    }

    public final void u() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int iH = aVar.v;
        if (iH == 0) {
            iH = aVar.h();
        }
        if (iH != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(aVar.peek());
            com.adjust.sdk.sig.r3.k(sb, aVar.x());
        } else {
            aVar.v = 0;
            int[] iArr = aVar.Z;
            int i = aVar.X - 1;
            iArr[i] = iArr[i] + 1;
            h();
        }
    }

    public final void x(i2 i2Var) {
        io.sentry.vendor.gson.stream.a aVar;
        while (true) {
            int i = this.c;
            int i2 = i2Var.a;
            aVar = this.a;
            if (i <= i2) {
                break;
            }
            io.sentry.vendor.gson.stream.b bVarPeek = aVar.peek();
            if (bVarPeek == io.sentry.vendor.gson.stream.b.END_OBJECT) {
                endObject();
            } else if (bVarPeek == io.sentry.vendor.gson.stream.b.END_ARRAY) {
                endArray();
            } else {
                skipValue();
            }
        }
        if (i2Var.c || aVar.peek() != i2Var.b) {
            return;
        }
        skipValue();
    }

    @Override // io.sentry.l3
    public final Float y0() {
        if (this.a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        u();
        return null;
    }
}
