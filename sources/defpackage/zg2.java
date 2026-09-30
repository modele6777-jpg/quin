package defpackage;

import androidx.compose.ui.node.Owner;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg2 {
    public static final pr4 a = new pr4(1, new pg2(1));
    public static final pr4 b = new pr4(1, new pg2(2));
    public static final pr4 c = new pr4(1, new pg2(7));
    public static final pr4 d = new pr4(1, new pg2(8));
    public static final pr4 e = new pr4(1, new pg2(9));
    public static final pr4 f = new pr4(1, new pg2(10));
    public static final pr4 g = new pr4(1, new pg2(11));
    public static final pr4 h = new pr4(1, new pg2(13));
    public static final pr4 i = new pr4(1, new pg2(14));
    public static final pr4 j = new pr4(1, new pg2(15));
    public static final pr4 k = new pr4(1, new pg2(12));
    public static final pr4 l = new pr4(1, new pg2(16));
    public static final pr4 m = new pr4(1, new pg2(17));
    public static final pr4 n = new pr4(1, new pg2(18));
    public static final pr4 o = new pr4(1, new pg2(19));
    public static final pr4 p;
    public static final pr4 q;
    public static final pr4 r;
    public static final pr4 s;
    public static final pr4 t;
    public static final pr4 u;
    public static final pr4 v;
    public static final pr4 w;
    public static final pr4 x;
    public static final pr4 y;

    static {
        new ace(new pg2(24));
        p = new pr4(1, new pg2(20));
        q = new pr4(1, new pg2(21));
        r = new pr4(1, new pg2(22));
        s = new pr4(1, new pg2(23));
        t = new pr4(1, new pg2(3));
        u = new pr4(1, new pg2(4));
        v = new pr4(1, new pg2(5));
        w = new pr4(1, new pg2(6));
        x = new pr4(0, new ead(2));
        y = new pr4(1, new ond(24));
    }

    public static final void a(final Owner owner, pw pwVar, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(1925803616);
        int i3 = i2 | (l46Var.g(owner) ? 4 : 2) | (l46Var.g(pwVar) ? 32 : 16) | (l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            e1b e1bVarA = a.a(owner.getAccessibilityManager());
            e1b e1bVarA2 = b.a(owner.getAutofill());
            e1b e1bVarA3 = d.a(owner.getAutofillManager());
            e1b e1bVarA4 = c.a(owner.getAutofillTree());
            e1b e1bVarA5 = e.a(owner.getClipboardManager());
            e1b e1bVarA6 = f.a(owner.getClipboard());
            e1b e1bVarA7 = h.a(owner.getDensity());
            e1b e1bVarA8 = i.a(owner.getFocusOwner());
            e1b e1bVarA9 = j.a(owner.getFontLoader());
            e1bVarA9.g = false;
            e1b e1bVarA10 = k.a(owner.getFontFamilyResolver());
            e1bVarA10.g = false;
            e1b e1bVarA11 = l.a(owner.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                final int i5 = 0;
                objR = new a26() { // from class: xg2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i6 = i5;
                        Owner owner2 = owner;
                        switch (i6) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                l46Var.p0(objR);
            }
            e1b e1bVarC = m.c((a26) objR);
            e1b e1bVarA12 = n.a(owner.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                final int i6 = 1;
                objR2 = new a26() { // from class: xg2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i7 = i6;
                        Owner owner2 = owner;
                        switch (i7) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                l46Var.p0(objR2);
            }
            e1b e1bVarC2 = p.c((a26) objR2);
            boolean z3 = i4 == 4;
            Object objR3 = l46Var.R();
            if (z3 || objR3 == i8cVar) {
                final int i7 = 2;
                objR3 = new a26() { // from class: xg2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i8 = i7;
                        Owner owner2 = owner;
                        switch (i8) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                l46Var.p0(objR3);
            }
            e1b e1bVarC3 = q.c((a26) objR3);
            boolean z4 = i4 == 4;
            Object objR4 = l46Var.R();
            final int i8 = 3;
            if (z4 || objR4 == i8cVar) {
                objR4 = new a26() { // from class: xg2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i9 = i8;
                        Owner owner2 = owner;
                        switch (i9) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                l46Var.p0(objR4);
            }
            e1b e1bVarC4 = r.c((a26) objR4);
            e1b e1bVarA13 = s.a(pwVar);
            e1b e1bVarA14 = t.a(owner.getViewConfiguration());
            e1b e1bVarA15 = u.a(owner.getWindowInfo());
            final int i9 = 4;
            boolean z5 = i4 == 4;
            Object objR5 = l46Var.R();
            if (z5 || objR5 == i8cVar) {
                objR5 = new a26() { // from class: xg2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i10 = i9;
                        Owner owner2 = owner;
                        switch (i10) {
                            case 0:
                                return owner2.getInputModeManager();
                            case 1:
                                return owner2.getTextInputService();
                            case 2:
                                return owner2.getSoftwareKeyboardController();
                            case 3:
                                return owner2.getTextToolbar();
                            default:
                                return owner2.getPointerIconService();
                        }
                    }
                };
                l46Var.p0(objR5);
            }
            mh3.b(new e1b[]{e1bVarA, e1bVarA2, e1bVarA3, e1bVarA4, e1bVarA5, e1bVarA6, e1bVarA7, e1bVarA8, e1bVarA9, e1bVarA10, e1bVarA11, e1bVarC, e1bVarA12, e1bVarC2, e1bVarC3, e1bVarC4, e1bVarA13, e1bVarA14, e1bVarA15, w.c((a26) objR5), g.a(owner.getGraphicsContext()), gb8.a.a(owner.getRetainedValuesStore()), o.a(owner.getLocaleList())}, dd2Var, l46Var, ((i3 >> 3) & 112) | 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, owner, pwVar, dd2Var, 12);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
