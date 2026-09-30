package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class a80 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public a80(Object obj, Looper looper, Looper looper2, l45 l45Var) {
        this.a = 1;
        this.c = new jce(new Handler(looper, null));
        this.d = new jce(new Handler(looper2, null));
        this.f = obj;
        this.g = obj;
        this.e = l45Var;
    }

    public static /* synthetic */ void n(a80 a80Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = a80Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        a80Var.m(i, str, str2);
        throw null;
    }

    public void A(rq6 rq6Var) {
        int iR0 = qd0.r0((rq6[]) this.c, rq6Var);
        if (iR0 >= 0) {
            rq6[] rq6VarArr = (rq6[]) this.c;
            int i = iR0 + 1;
            qd0.Z(iR0, i, this.b, rq6VarArr, rq6VarArr);
            rq6[] rq6VarArr2 = (rq6[]) this.c;
            int i2 = this.b;
            rq6VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, iR0, i2 - i);
            byte[] bArr = (byte[]) this.e;
            qd0.X(iR0, i, this.b, bArr, bArr);
            this.b--;
        }
    }

    public void B(Runnable runnable) {
        jce jceVar = (jce) this.c;
        if (jceVar.a.getLooper().getThread().isAlive()) {
            jceVar.e(runnable);
        }
    }

    public void C(ColorStateList colorStateList) {
        if (colorStateList != null) {
            gk2 gk2Var = (gk2) this.e;
            if (gk2Var == null) {
                gk2Var = new gk2();
                this.e = gk2Var;
            }
            gk2Var.c = colorStateList;
            gk2Var.b = true;
        } else {
            this.e = null;
        }
        c();
    }

    public void D(int i) {
        pa7.J(i >= 0);
        this.b = i;
        o(i);
    }

    public void E(ColorStateList colorStateList) {
        gk2 gk2Var = (gk2) this.f;
        if (gk2Var == null) {
            gk2Var = new gk2();
            this.f = gk2Var;
        }
        gk2Var.c = colorStateList;
        gk2Var.b = true;
        c();
    }

    public void F(PorterDuff.Mode mode) {
        gk2 gk2Var = (gk2) this.f;
        if (gk2Var == null) {
            gk2Var = new gk2();
            this.f = gk2Var;
        }
        gk2Var.d = mode;
        gk2Var.a = true;
        c();
    }

    public int G() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean H() {
        int iG = G();
        String str = (String) this.g;
        if (iG >= str.length() || iG == -1 || str.charAt(iG) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean I(boolean z) {
        int iZ = z(G());
        String str = (String) this.g;
        int length = str.length() - iZ;
        if (length >= 4 && iZ != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == str.charAt(iZ + i)) {
                }
            }
            if (length <= 4 || i7h.l(str.charAt(iZ + 4)) != 0) {
                if (z) {
                    this.b = iZ + 4;
                }
                return true;
            }
        }
        return false;
    }

    public void J(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strL = l();
                this.b = i;
                if (pa7.t(strL, "null")) {
                    m(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strL2 = i7h.L(i7h.l(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        n(this, tec.m("Expected ", strL2, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public void K(Object obj) {
        Object obj2 = this.f;
        this.f = obj;
        if (obj2.equals(obj)) {
            return;
        }
        y45 y45Var = ((l45) this.e).a;
        ((Integer) obj2).getClass();
        int iIntValue = ((Integer) obj).intValue();
        y45Var.Z();
        y45Var.l.g.b(40, iIntValue, 0).b();
        y45Var.m.e(21, new no3(iIntValue, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, defpackage.d0a r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.b
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.b
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            krb r3 = (defpackage.krb) r3
            java.lang.String r5 = defpackage.pqf.a
            long r5 = r3.b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.d
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            d0a r3 = new d0a
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            d0a r3 = (defpackage.d0a) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.g
            krb r12 = (defpackage.krb) r12
            if (r12 == 0) goto L6c
            long r5 = r12.b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.a
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            krb r12 = new krb
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            krb r12 = (defpackage.krb) r12
        L7e:
            java.util.ArrayList r0 = r12.a
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.pa7.A(r8)
            boolean r2 = r0.isEmpty()
            defpackage.pa7.J(r2)
            r12.b = r10
            r0.add(r3)
            r1.add(r12)
            r9.g = r12
            int r10 = r9.b
            if (r10 == r4) goto L9e
            r9.o(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.c
            r45 r9 = (defpackage.r45) r9
            r9.g(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a80.a(long, d0a):void");
    }

    public int b(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (p(charSequence, i + 3) + (p(charSequence, i) << 12) + (p(charSequence, i + 1) << 8) + (p(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return b(charSequence, this.b);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void c() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((gk2) this.e) != null) {
                gk2 gk2Var = (gk2) this.g;
                if (gk2Var == null) {
                    gk2Var = new gk2();
                    this.g = gk2Var;
                }
                gk2Var.c = null;
                gk2Var.b = false;
                gk2Var.d = null;
                gk2Var.a = false;
                WeakHashMap weakHashMap = nvf.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    gk2Var.b = true;
                    gk2Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    gk2Var.a = true;
                    gk2Var.d = backgroundTintMode;
                }
                if (gk2Var.b || gk2Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = s80.b;
                    cyb.i(background, gk2Var, drawableState);
                    return;
                }
            }
            gk2 gk2Var2 = (gk2) this.f;
            if (gk2Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = s80.b;
                cyb.i(background, gk2Var2, drawableState2);
            } else {
                gk2 gk2Var3 = (gk2) this.e;
                if (gk2Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = s80.b;
                    cyb.i(background, gk2Var3, drawableState3);
                }
            }
        }
    }

    public boolean d() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public void e(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String f() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        i('\"');
        int i = this.b;
        int iN = v4e.N(str, '\"', i, 4);
        if (iN == -1) {
            l();
            int i2 = this.b;
            n(this, ib8.j("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iN) {
            if (str.charAt(i3) == '\\') {
                int iZ = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iZ, i3);
                        int iZ2 = z(i3 + 1);
                        if (iZ2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iB = iZ2 + 1;
                        char cCharAt2 = str.charAt(iZ2);
                        if (cCharAt2 == 'u') {
                            iB = b(str, iB);
                        } else {
                            char c = cCharAt2 < 'u' ? bx1.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iZ = z(iB);
                        if (iZ == -1) {
                            n(this, "Unexpected EOF", iZ, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iZ, i3);
                            iZ = z(i3);
                            if (iZ == -1) {
                                n(this, "Unexpected EOF", iZ, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iZ;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iZ, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iZ, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iN + 1;
        return str.substring(i, iN);
    }

    public byte g() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return i7h.l(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte h(byte b) {
        String str = (String) this.g;
        byte bG = g();
        if (bG == b) {
            return bG;
        }
        String strL = i7h.L(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        n(this, tec.m("Expected ", strL, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void i(char c) {
        int i = this.b;
        if (i == -1) {
            J(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                J(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        J(c);
        throw null;
    }

    public long j() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int iZ = z(G());
        String str = (String) this.g;
        if (iZ >= str.length() || iZ == -1) {
            n(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iZ) == '\"') {
            iZ++;
            if (iZ == str.length()) {
                n(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iZ;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == iZ) {
                        n(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (i7h.l(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                n(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != iZ) {
                            n(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == iZ) {
                        n(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == iZ) {
                    n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iZ;
        if (iZ == i || (z6 && iZ == i - 1)) {
            n(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                n(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                n(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    ap.c();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                n(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                n(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        n(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String k() {
        String str = (String) this.e;
        if (str == null) {
            return f();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public String l() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iG = G();
        if (iG >= str.length() || iG == -1) {
            n(this, "EOF", iG, null, 4);
            throw null;
        }
        byte bL = i7h.l(str.charAt(iG));
        if (bL == 1) {
            return k();
        }
        if (bL != 0) {
            n(this, "Expected beginning of the string, but got " + str.charAt(iG), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (i7h.l(str.charAt(iG)) == 0) {
            iG++;
            if (iG >= str.length()) {
                sb.append((CharSequence) str, this.b, iG);
                int iZ = z(iG);
                if (iZ == -1) {
                    this.b = iG;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iG = iZ;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iG);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iG).toString();
        }
        this.b = iG;
        return string;
    }

    public void m(int i, String str, String str2) {
        String strF = ((veh) this.d).f();
        String str3 = (String) this.g;
        str3.getClass();
        String string = ((dh7) this.c).j ? kj0.n0(str3, i).toString() : null;
        throw new lh7(kj0.b0(str, strF, str2, i, string), str, strF, i, string, str2);
    }

    public void o(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f;
        while (priorityQueue.size() > i) {
            krb krbVar = (krb) priorityQueue.poll();
            String str = pqf.a;
            int i2 = 0;
            while (true) {
                arrayList = krbVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((r45) this.c).g(krbVar.b, (d0a) arrayList.get(i2));
                ((ArrayDeque) this.d).push((d0a) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            krb krbVar2 = (krb) this.g;
            if (krbVar2 != null && krbVar2.b == krbVar.b) {
                this.g = null;
            }
            ((ArrayDeque) this.e).push(krbVar);
        }
    }

    public int p(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public ColorStateList q() {
        gk2 gk2Var = (gk2) this.f;
        if (gk2Var != null) {
            return (ColorStateList) gk2Var.c;
        }
        return null;
    }

    public PorterDuff.Mode r() {
        gk2 gk2Var = (gk2) this.f;
        if (gk2Var != null) {
            return (PorterDuff.Mode) gk2Var.d;
        }
        return null;
    }

    public void s(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = hbb.y;
        psd psdVarX = psd.x(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) psdVarX.c;
        View view2 = (View) this.c;
        nvf.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) psdVarX.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.b = typedArray.getResourceId(0, -1);
                s80 s80Var = (s80) this.d;
                Context context2 = view.getContext();
                int i2 = this.b;
                synchronized (s80Var) {
                    colorStateListG = s80Var.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    C(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(psdVarX.o(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(do4.b(typedArray.getInt(2, -1), null));
            }
            psdVarX.z();
        } catch (Throwable th) {
            psdVarX.z();
            throw th;
        }
    }

    public ta9 t(String str) {
        sa9 sa9Var;
        str.getClass();
        ace aceVar = (ace) this.g;
        if (aceVar == null || (sa9Var = (sa9) aceVar.getValue()) == null) {
            return null;
        }
        int i = ua9.e;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = sa9Var.d(uri, (LinkedHashMap) this.e);
        if (bundleD == null) {
            return null;
        }
        return new ta9((ua9) this.c, bundleD, sa9Var.l, sa9Var.b(uri), false);
    }

    public String toString() {
        switch (this.a) {
            case 6:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return tec.n(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public void u() {
        this.b = -1;
        C(null);
        c();
    }

    public void v(int i) {
        ColorStateList colorStateListG;
        this.b = i;
        s80 s80Var = (s80) this.d;
        if (s80Var != null) {
            Context context = ((View) this.c).getContext();
            synchronized (s80Var) {
                colorStateListG = s80Var.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        C(colorStateListG);
        c();
    }

    public String w(String str) {
        str.getClass();
        int i = this.b;
        try {
            if (g() == 6 && pa7.t(y(), str)) {
                this.e = null;
                if (g() == 5) {
                    return y();
                }
            }
            return null;
        } finally {
            this.b = i;
            this.e = null;
        }
    }

    public byte x() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int iZ = z(i);
            if (iZ == -1) {
                this.b = iZ;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iZ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iZ;
                return i7h.l(cCharAt);
            }
            i = iZ + 1;
        }
    }

    public String y() {
        if (x() != 1) {
            return null;
        }
        String strK = k();
        this.e = strK;
        return strK;
    }

    public int z(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public a80(ua9 ua9Var) {
        this.a = 3;
        this.c = ua9Var;
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
    }

    public a80(View view) {
        this.a = 0;
        this.b = -1;
        this.c = view;
        this.d = s80.a();
    }

    public a80(r45 r45Var) {
        this.a = 4;
        this.c = r45Var;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new PriorityQueue();
        this.b = -1;
    }

    public a80(List list, List list2, List list3, Set set, int i, kd9 kd9Var) {
        this.a = 2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = set;
        this.b = i;
        this.g = kd9Var;
    }

    public a80(String str, dh7 dh7Var) {
        this.a = 6;
        str.getClass();
        this.c = dh7Var;
        this.d = new veh(dh7Var);
        this.f = new StringBuilder();
        this.g = str;
    }

    public a80() {
        this.a = 5;
        this.c = new rq6[32];
        this.d = new float[32];
        this.e = new byte[32];
        x79 x79Var = mec.a;
        this.f = new x79();
        this.g = new x79();
    }
}
