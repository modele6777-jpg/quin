package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class avd implements Iterator {
    public String b;
    public final CharSequence c;
    public final cx1 d;
    public final boolean e;
    public int g;
    public final /* synthetic */ int v;
    public final /* synthetic */ cvd w;
    public int a = 2;
    public int f = 0;

    public avd(cvd cvdVar, j27 j27Var, CharSequence charSequence, int i) {
        this.v = i;
        this.w = cvdVar;
        this.d = (cx1) j27Var.c;
        this.e = j27Var.a;
        this.g = j27Var.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int length;
        cx1 cx1Var;
        pa7.J(this.a != 4);
        int iB = kv2.B(this.a);
        if (iB == 0) {
            return true;
        }
        if (iB != 2) {
            this.a = 4;
            int i = this.f;
            while (true) {
                int length2 = this.f;
                if (length2 != -1) {
                    int i2 = this.v;
                    cvd cvdVar = this.w;
                    CharSequence charSequence = this.c;
                    switch (i2) {
                        case 0:
                            dx1 dx1Var = (dx1) ((vrb) cvdVar).b;
                            int length3 = charSequence.length();
                            pa7.G(length2, length3);
                            while (true) {
                                if (length2 >= length3) {
                                    length2 = -1;
                                } else if (!dx1Var.a(charSequence.charAt(length2))) {
                                    length2++;
                                }
                                break;
                            }
                            break;
                        default:
                            String str = ((ig4) cvdVar).b;
                            int length4 = str.length();
                            int length5 = charSequence.length() - length4;
                            while (true) {
                                if (length2 > length5) {
                                    length2 = -1;
                                    break;
                                } else {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length4) {
                                            break;
                                        } else if (charSequence.charAt(i3 + length2) != str.charAt(i3)) {
                                            length2++;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    if (length2 == -1) {
                        length2 = charSequence.length();
                        this.f = -1;
                        length = -1;
                    } else {
                        switch (i2) {
                            case 0:
                                length = length2 + 1;
                                break;
                            default:
                                length = ((ig4) cvdVar).b.length() + length2;
                                break;
                        }
                        this.f = length;
                    }
                    if (length == i) {
                        int i4 = length + 1;
                        this.f = i4;
                        if (i4 > charSequence.length()) {
                            this.f = -1;
                        }
                    } else {
                        while (true) {
                            cx1Var = this.d;
                            if (i < length2 && cx1Var.a(charSequence.charAt(i))) {
                                i++;
                            }
                        }
                        while (length2 > i && cx1Var.a(charSequence.charAt(length2 - 1))) {
                            length2--;
                        }
                        if (this.e && i == length2) {
                            i = this.f;
                        } else {
                            int i5 = this.g;
                            if (i5 == 1) {
                                length2 = charSequence.length();
                                this.f = -1;
                                while (length2 > i && cx1Var.a(charSequence.charAt(length2 - 1))) {
                                    length2--;
                                }
                            } else {
                                this.g = i5 - 1;
                            }
                            string = charSequence.subSequence(i, length2).toString();
                        }
                    }
                } else {
                    this.a = 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
