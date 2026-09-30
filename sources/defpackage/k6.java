package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 extends j6 {
    public static k6 e;
    public static k6 f;
    public static k6 g;
    public static final txb h = txb.b;
    public static final txb i = txb.a;
    public final /* synthetic */ int c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(int i2) {
        super(0);
        this.c = i2;
    }

    public boolean A(int i2) {
        if (i2 <= 0 || !B(i2 - 1)) {
            return false;
        }
        return i2 == l().length() || !B(i2);
    }

    public boolean B(int i2) {
        if (i2 < 0 || i2 >= l().length()) {
            return false;
        }
        return Character.isLetterOrDigit(l().codePointAt(i2));
    }

    @Override // defpackage.j6
    public final int[] h(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        pa7.g0("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            pa7.g0("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return k(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        pa7.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (l().length() <= 0 || i2 >= l().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!B(i2) && (!B(i2) || (i2 != 0 && B(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        pa7.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    pa7.g0("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !A(iFollowing2)) {
                    return null;
                }
                return k(i2, iFollowing2);
            default:
                if (l().length() <= 0 || i2 >= l().length()) {
                    return null;
                }
                ste steVar = (ste) this.d;
                txb txbVar = h;
                if (i2 < 0) {
                    if (steVar == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    iD = steVar.b.d(0);
                } else {
                    if (steVar == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    int iD2 = steVar.b.d(i2);
                    iD = y(iD2, txbVar) == i2 ? iD2 : iD2 + 1;
                }
                ste steVar2 = (ste) this.d;
                if (steVar2 == null) {
                    pa7.g0("layoutResult");
                    throw null;
                }
                if (iD >= steVar2.b.f) {
                    return null;
                }
                return k(y(iD, txbVar), y(iD, i) + 1);
        }
    }

    @Override // defpackage.j6
    public final int[] s(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        pa7.g0("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            pa7.g0("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return k(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        pa7.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = l().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !B(i2 - 1) && !A(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        pa7.g0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    pa7.g0("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !B(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !B(iPreceding2 - 1)) {
                    return k(iPreceding2, i2);
                }
                return null;
            default:
                if (l().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = l().length();
                ste steVar = (ste) this.d;
                txb txbVar = i;
                if (i2 > length3) {
                    if (steVar == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    iD = steVar.b.d(l().length());
                } else {
                    if (steVar == null) {
                        pa7.g0("layoutResult");
                        throw null;
                    }
                    int iD2 = steVar.b.d(i2);
                    iD = y(iD2, txbVar) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return k(y(iD, h), y(iD, txbVar) + 1);
        }
    }

    public int y(int i2, txb txbVar) {
        ste steVar = (ste) this.d;
        if (steVar == null) {
            pa7.g0("layoutResult");
            throw null;
        }
        int iJ = steVar.j(i2);
        ste steVar2 = (ste) this.d;
        if (steVar2 == null) {
            pa7.g0("layoutResult");
            throw null;
        }
        txb txbVarK = steVar2.k(iJ);
        ste steVar3 = (ste) this.d;
        if (txbVar != txbVarK) {
            if (steVar3 != null) {
                return steVar3.j(i2);
            }
            pa7.g0("layoutResult");
            throw null;
        }
        if (steVar3 != null) {
            return steVar3.b.c(i2, false) - 1;
        }
        pa7.g0("layoutResult");
        throw null;
    }

    public void z(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    pa7.g0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    pa7.g0("impl");
                    throw null;
                }
        }
    }
}
