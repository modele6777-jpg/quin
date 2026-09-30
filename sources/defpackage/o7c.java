package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.share.SharedConversationEntry;
import ai.askquin.ui.share.SharedConversationEntryType;
import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.view.Window;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o7c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    public static final c78 C(pp5 pp5Var, String str, String str2) {
        ft8 ft8Var;
        pp5Var.getClass();
        str.getClass();
        str2.getClass();
        ?? R0 = pp5Var.a;
        Iterator it = R0.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            ot8 ot8Var = (ot8) it.next();
            if (ot8Var instanceof et8) {
                et8 et8Var = (et8) ot8Var;
                if (et8Var.c && pa7.t(et8Var.b, str2)) {
                    break;
                }
            }
            i++;
        }
        boolean z = i >= 0;
        if (z) {
            R0 = s72.r0(R0, i + 1);
        }
        c78 c78VarW = t72.w();
        boolean z2 = z;
        for (ot8 ot8Var2 : R0) {
            if (ot8Var2 instanceof nt8) {
                if (z || !pa7.t(((nt8) ot8Var2).a, str)) {
                    j(c78VarW, SharedConversationEntryType.User, ((nt8) ot8Var2).a);
                } else {
                    z = true;
                }
            } else if (ot8Var2 instanceof ct8) {
                String str3 = ((ct8) ot8Var2).a;
                if (z2 || !pa7.t(str3, str2)) {
                    j(c78VarW, SharedConversationEntryType.Assistant, str3);
                } else {
                    z2 = true;
                }
            } else if (ot8Var2 instanceof et8) {
                String str4 = ((et8) ot8Var2).b;
                if (z2 || !pa7.t(str4, str2)) {
                    j(c78VarW, SharedConversationEntryType.Assistant, str4);
                } else {
                    z2 = true;
                }
            } else {
                List list = null;
                if (ot8Var2 instanceof ht8) {
                    ht8 ht8Var = (ht8) ot8Var2;
                    t12 t12Var = (t12) pp5Var.b.get(ht8Var.a);
                    if (t12Var != null && (ft8Var = t12Var.b) != null) {
                        list = ft8Var.b;
                    }
                    if (list == null) {
                        list = pu4.a;
                    }
                    if (!ht8Var.c && !list.isEmpty()) {
                        c78VarW.add(new SharedConversationEntry(SharedConversationEntryType.ClarifyingCard, ht8Var.b, list));
                    }
                } else if (ot8Var2 instanceof gt8) {
                    j(c78VarW, SharedConversationEntryType.Assistant, ((gt8) ot8Var2).b);
                } else if (!(ot8Var2 instanceof dt8) && !(ot8Var2 instanceof ft8) && !(ot8Var2 instanceof jt8) && !(ot8Var2 instanceof kt8) && !(ot8Var2 instanceof lt8)) {
                    ap.c();
                    return null;
                }
            }
        }
        return c78VarW.n();
    }

    public static final List D(pp5 pp5Var) {
        pp5Var.getClass();
        return fyc.A(fyc.z(new zi5(s72.m0(pp5Var.b.values()), new e2d(18), jyc.a), 3));
    }

    public static final tjd E(tjd tjdVar, tjd tjdVar2) {
        tjdVar.getClass();
        tjdVar2.getClass();
        return i7h.x(tjdVar) ? tjdVar : new j(tjdVar, tjdVar2);
    }

    public static /* synthetic */ boolean F(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ivg ivgVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ivgVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(ivgVar) != obj && atomicReferenceFieldUpdater.get(ivgVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0064, please report this as an issue */
    public static final void a(boolean z, e8b e8bVar, dd2 dd2Var, l46 l46Var, int i, int i2) {
        boolean zA;
        int i3;
        e8b e8bVar2;
        boolean z2;
        e8b e8bVar3;
        ojb ojbVarV;
        mfc mfcVar;
        iy9 iy9Var;
        int iOrdinal;
        y8b y8bVar;
        int iOrdinal2;
        w8b w8bVar;
        int iOrdinal3;
        e8b e8bVar4;
        int i4;
        int i5;
        l46Var.h0(-1910890469);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                zA = z;
                if (l46Var.h(zA)) {
                    i5 = 4;
                }
                i3 = i5 | i;
            } else {
                zA = z;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            zA = z;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                e8bVar2 = e8bVar;
                i3 |= l46Var.g(e8bVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (l46Var.i(dd2Var)) {
                    i4 = 256;
                } else {
                    i4 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i3 & 1, z2)) {
                l46Var.b0();
                if ((i & 1) != 0 || l46Var.C()) {
                    if ((i2 & 1) != 0) {
                        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                            l46Var.f0(1880264400);
                            zA = if9.B(l46Var);
                        } else {
                            l46Var.f0(1880265262);
                            zA = li4.a(l46Var);
                        }
                        l46Var.r(false);
                    }
                    if (i6 != 0) {
                        e8bVar2 = null;
                    }
                } else {
                    l46Var.Z();
                }
                l46Var.s();
                mfcVar = e8bVar2 != null ? e8bVar2.C : null;
                if (mfcVar == null) {
                    l46Var.f0(1880270976);
                    mfcVar = (mfc) jzb.i(k8b.a, k8b.c(), l46Var, 0, 2).getValue();
                } else {
                    l46Var.f0(1880269209);
                }
                l46Var.r(false);
                if (e8bVar2 == null) {
                    l46Var.f0(-1841051676);
                    iOrdinal3 = mfcVar.ordinal();
                    if (iOrdinal3 != 0) {
                        l46Var.f0(-1840925382);
                        if (zA) {
                            e8bVar4 = l8b.b;
                        } else {
                            e8bVar4 = l8b.c;
                        }
                        iy9Var = new iy9(e8bVar4, l8b.n(e8bVar4, zA, l46Var));
                        l46Var.r(false);
                    } else {
                        if (iOrdinal3 == 1) {
                            throw tec.d(1880273886, l46Var, false);
                        }
                        l46Var.f0(-1840754913);
                        e8b e8bVar5 = l8b.d;
                        iy9Var = new iy9(e8bVar5, l8b.n(e8bVar5, true, l46Var));
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1840698338);
                    iy9Var = new iy9(e8bVar2, l8b.n(e8bVar2, zA, l46Var));
                    l46Var.r(false);
                }
                e8b e8bVar6 = (e8b) iy9Var.a();
                m82 m82Var = (m82) iy9Var.b();
                e1b e1bVarA = l8b.a.a(e8bVar6);
                pr4 pr4Var = x8b.a;
                mfcVar.getClass();
                iOrdinal = mfcVar.ordinal();
                if (iOrdinal != 0) {
                    l46Var.f0(598211076);
                    y8bVar = new y8b(cr5.b(), yp5.a, cr5.h, cr5.a(l46Var));
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(598209718, l46Var, false);
                    }
                    l46Var.f0(598217497);
                    l46Var.r(false);
                    y8bVar = x8b.b;
                }
                e1b e1bVarA2 = pr4Var.a(y8bVar);
                pr4 pr4Var2 = eze.c;
                iOrdinal2 = mfcVar.ordinal();
                if (iOrdinal2 != 0) {
                    w8bVar = eze.a;
                } else {
                    if (iOrdinal2 == 1) {
                        ap.c();
                        return;
                    }
                    w8bVar = eze.b;
                }
                mh3.b(new e1b[]{e1bVarA, e1bVarA2, pr4Var2.a(w8bVar)}, af1.b0(903033691, new p4c(19, m82Var, dd2Var), l46Var), l46Var, 48);
            } else {
                l46Var.Z();
            }
            e8bVar3 = e8bVar2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new p83(zA, e8bVar3, dd2Var, i, i2, 4);
            }
        }
        i3 |= 48;
        e8bVar2 = e8bVar;
        if ((i & 384) == 0) {
            if (l46Var.i(dd2Var)) {
                i4 = 256;
            } else {
                i4 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i3 & 1, z2)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if ((i2 & 1) != 0) {
                    if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                        l46Var.f0(1880264400);
                        zA = if9.B(l46Var);
                    } else {
                        l46Var.f0(1880265262);
                        zA = li4.a(l46Var);
                    }
                    l46Var.r(false);
                }
                if (i6 != 0) {
                    e8bVar2 = null;
                }
            } else {
                if ((i2 & 1) != 0) {
                    if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                        l46Var.f0(1880264400);
                        zA = if9.B(l46Var);
                    } else {
                        l46Var.f0(1880265262);
                        zA = li4.a(l46Var);
                    }
                    l46Var.r(false);
                }
                if (i6 != 0) {
                    e8bVar2 = null;
                }
            }
            l46Var.s();
            if (e8bVar2 != null) {
            }
            if (mfcVar == null) {
                l46Var.f0(1880270976);
                mfcVar = (mfc) jzb.i(k8b.a, k8b.c(), l46Var, 0, 2).getValue();
            } else {
                l46Var.f0(1880269209);
            }
            l46Var.r(false);
            if (e8bVar2 == null) {
                l46Var.f0(-1841051676);
                iOrdinal3 = mfcVar.ordinal();
                if (iOrdinal3 != 0) {
                    l46Var.f0(-1840925382);
                    if (zA) {
                        e8bVar4 = l8b.b;
                    } else {
                        e8bVar4 = l8b.c;
                    }
                    iy9Var = new iy9(e8bVar4, l8b.n(e8bVar4, zA, l46Var));
                    l46Var.r(false);
                } else {
                    if (iOrdinal3 == 1) {
                        throw tec.d(1880273886, l46Var, false);
                    }
                    l46Var.f0(-1840754913);
                    e8b e8bVar7 = l8b.d;
                    iy9Var = new iy9(e8bVar7, l8b.n(e8bVar7, true, l46Var));
                    l46Var.r(false);
                }
                l46Var.r(false);
            } else {
                l46Var.f0(-1840698338);
                iy9Var = new iy9(e8bVar2, l8b.n(e8bVar2, zA, l46Var));
                l46Var.r(false);
            }
            e8b e8bVar8 = (e8b) iy9Var.a();
            m82 m82Var2 = (m82) iy9Var.b();
            e1b e1bVarA3 = l8b.a.a(e8bVar8);
            pr4 pr4Var3 = x8b.a;
            mfcVar.getClass();
            iOrdinal = mfcVar.ordinal();
            if (iOrdinal != 0) {
                l46Var.f0(598211076);
                y8bVar = new y8b(cr5.b(), yp5.a, cr5.h, cr5.a(l46Var));
                l46Var.r(false);
            } else {
                if (iOrdinal == 1) {
                    throw tec.d(598209718, l46Var, false);
                }
                l46Var.f0(598217497);
                l46Var.r(false);
                y8bVar = x8b.b;
            }
            e1b e1bVarA4 = pr4Var3.a(y8bVar);
            pr4 pr4Var4 = eze.c;
            iOrdinal2 = mfcVar.ordinal();
            if (iOrdinal2 != 0) {
                w8bVar = eze.a;
            } else {
                if (iOrdinal2 == 1) {
                    ap.c();
                    return;
                }
                w8bVar = eze.b;
            }
            mh3.b(new e1b[]{e1bVarA3, e1bVarA4, pr4Var4.a(w8bVar)}, af1.b0(903033691, new p4c(19, m82Var2, dd2Var), l46Var), l46Var, 48);
        } else {
            l46Var.Z();
        }
        e8bVar3 = e8bVar2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p83(zA, e8bVar3, dd2Var, i, i2, 4);
        }
    }

    public static final void b(dd2 dd2Var, l46 l46Var, int i) {
        dd2 dd2Var2;
        l46 l46Var2;
        l46Var.h0(533263781);
        boolean zS = true;
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            if (k8b.f((e8b) l46Var.k(l8b.a))) {
                l46Var.f0(-622638211);
            } else {
                l46Var.f0(1365388724);
                zS = true ^ g21.S(l46Var);
            }
            l46Var.r(false);
            if (zS) {
                l46Var.f0(-622605526);
                dd2Var.z(l46Var, 6);
                l46Var.r(false);
                dd2Var2 = dd2Var;
                l46Var2 = l46Var;
            } else {
                l46Var.f0(-622578897);
                dd2Var2 = dd2Var;
                l46Var2 = l46Var;
                a(true, null, dd2Var2, l46Var2, 390, 2);
                l46Var2.r(false);
            }
        } else {
            dd2Var2 = dd2Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dve(dd2Var2, i);
        }
    }

    public static final void c(final long j, final long j2, final boolean z, l46 l46Var, final int i) {
        o7c j8gVar;
        l46Var.h0(1814549538);
        int i2 = (l46Var.f(j) ? 4 : 2) | i | (l46Var.f(j2) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            Context context = (Context) l46Var.k(uq.b);
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                q6c.l(window, false);
                window.getDecorView();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    j8gVar = new l8g(window);
                } else {
                    j8gVar = i3 >= 30 ? new j8g(window) : new i8g(window);
                }
                boolean z2 = !z;
                j8gVar.B(z2);
                j8gVar.A(z2);
                window.getDecorView().setBackgroundColor(abg.Z(j));
                window.setStatusBarColor(abg.Z(y72.j));
                window.setNavigationBarColor(abg.Z(j2));
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(j, j2, z, i) { // from class: cve
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ boolean c;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    o7c.c(this.a, this.b, this.c, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x015e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x016e  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:130:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01be  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:145:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x021d  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x030f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0312  */
    /* JADX WARN: Code duplicated, block: B:191:0x0319  */
    /* JADX WARN: Code duplicated, block: B:192:0x031d  */
    /* JADX WARN: Code duplicated, block: B:194:0x033b  */
    /* JADX WARN: Code duplicated, block: B:197:0x034d  */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    public static final void d(j09 j09Var, final qhe qheVar, TarotSkinIdentify tarotSkinIdentify, boolean z, bn2 bn2Var, float f, a26 a26Var, boolean z2, l46 l46Var, final int i, final int i2) {
        j09 j09Var2;
        int i3;
        boolean z3;
        int i4;
        bn2 bn2Var2;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        a26 a26Var2;
        int i9;
        boolean z4;
        final TarotSkinIdentify tarotSkinIdentify2;
        final boolean z5;
        final j09 j09Var3;
        final boolean z6;
        final bn2 bn2Var3;
        final a26 a26Var3;
        final float f3;
        ojb ojbVarV;
        TarotSkinIdentify tarotSkinIdentifyC;
        bn2 bn2Var4;
        TarotSkinIdentify tarotSkinIdentify3;
        j09 j09Var4;
        bn2 bn2Var5;
        float f4;
        boolean z7;
        boolean z8;
        ykd ykdVarC;
        x16 x16Var;
        nfc nfcVarB;
        boolean zG;
        Object obj;
        Object objB;
        nfc nfcVarB2;
        boolean zG2;
        Object objR;
        boolean z9;
        Object objR2;
        boolean z10;
        boolean zG3;
        Object objR3;
        float aspectRatio;
        float f5;
        bn2 bn2Var6;
        Object objC;
        int i10;
        Object objValueOf = Integer.valueOf(R.drawable.card_cover_white);
        qheVar.getClass();
        String str = qheVar.a;
        l46Var.h0(1404194230);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(qheVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            } else {
                if (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal())) {
                    i10 = 256;
                } else {
                    i10 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
            }
            i3 |= i10;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    bn2Var2 = bn2Var;
                    if (l46Var.g(bn2Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 196608) == 0) {
                        if (l46Var.d(f2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    a26Var2 = a26Var;
                } else {
                    a26Var2 = a26Var;
                    if ((i & 1572864) == 0) {
                        if (l46Var.i(a26Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 12582912) != 0) {
                    i3 |= ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0 || !l46Var.h(z2)) ? 4194304 : 8388608;
                }
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i3 & 1, z4)) {
                    l46Var.b0();
                    if ((i & 1) != 0 || l46Var.C()) {
                        if (i11 != 0) {
                            j09Var2 = g09.a;
                        }
                        if ((i2 & 4) != 0) {
                            tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                            i3 &= -897;
                        } else {
                            tarotSkinIdentifyC = tarotSkinIdentify;
                        }
                        if (i12 != 0) {
                            z3 = true;
                        }
                        if (i4 != 0) {
                            bn2Var4 = an2.d;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i6 != 0) {
                            f2 = 16.0f;
                        }
                        if (i8 != 0) {
                            a26Var2 = null;
                        }
                        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            if (l46Var.k(snd.b) != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            i3 &= -29360129;
                            bn2Var5 = bn2Var4;
                            f4 = f2;
                            z8 = z3;
                            z2 = z7;
                            tarotSkinIdentify3 = tarotSkinIdentifyC;
                            j09Var4 = j09Var2;
                        } else {
                            tarotSkinIdentify3 = tarotSkinIdentifyC;
                            j09Var4 = j09Var2;
                            bn2Var5 = bn2Var4;
                            f4 = f2;
                        }
                        l46Var.s();
                        if (z8) {
                            ykdVarC = ykd.c;
                        } else {
                            ykdVarC = xdc.c(120, 210);
                        }
                        x16Var = (x16) l46Var.k(o10.a);
                        Context context = (Context) l46Var.k(uq.b);
                        nfcVarB = kr7.b(l46Var);
                        zG = l46Var.g(null) | l46Var.g(nfcVarB);
                        Object objR4 = l46Var.R();
                        Object obj2 = sf2.a;
                        if (!zG || objR4 == obj2) {
                            obj = null;
                            objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                            l46Var.p0(objB);
                        } else {
                            objB = objR4;
                            obj = null;
                        }
                        kmd kmdVar = (kmd) objB;
                        nfcVarB2 = kr7.b(l46Var);
                        zG2 = l46Var.g(obj) | l46Var.g(nfcVarB2);
                        objR = l46Var.R();
                        if (zG2 || objR == obj2) {
                            objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                            l46Var.p0(objR);
                        }
                        whb whbVar = ((ys3) ((cmd) objR)).x;
                        e89 e89VarI = jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0);
                        if (!((Boolean) l46Var.k(h57.a)).booleanValue() || tarotSkinIdentify3 == null) {
                            z9 = false;
                            l46Var.f0(-630286969);
                            l46Var.r(false);
                            objR2 = objValueOf;
                        } else {
                            l46Var.f0(-630227635);
                            boolean zE = l46Var.e(((Number) e89VarI.getValue()).intValue()) | l46Var.g(str) | ((((i3 & 896) ^ 384) > 256 && l46Var.e(tarotSkinIdentify3.ordinal())) || (i3 & 384) == 256);
                            objR2 = l46Var.R();
                            if (zE || objR2 == obj2) {
                                Object objC2 = kmdVar.c(tarotSkinIdentify3, str);
                                if (objC2 != null) {
                                    objC = objC2;
                                } else if (tarotSkinIdentify3.getRequiresDownload()) {
                                    objC = Integer.valueOf(hfc.q(tarotSkinIdentify3).c());
                                } else {
                                    objC = kmdVar.c(r8c.d(), str);
                                    if (objC == null) {
                                        objC = objValueOf;
                                    }
                                }
                                l46Var.p0(objC);
                                objR2 = objC;
                            }
                            z9 = false;
                            l46Var.r(false);
                        }
                        aw6 aw6Var = (aw6) l46Var.k(n72.a);
                        pw6 pw6Var = new pw6(context);
                        pw6Var.c = objR2;
                        pw6Var.i = m81.a;
                        pw6Var.k = zdc.b;
                        pw6Var.j = new tib(ykdVarC);
                        sw6 sw6VarA = pw6Var.a();
                        if ((3670016 & i3) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = z9;
                        }
                        zG3 = z10 | l46Var.g(x16Var);
                        objR3 = l46Var.R();
                        if (zG3 || objR3 == obj2) {
                            objR3 = new slc(a26Var2, x16Var);
                            l46Var.p0(objR3);
                        }
                        AsyncImagePainter asyncImagePainterY = z7f.Y(sw6VarA, aw6Var, (a26) objR3, l46Var, 0, 52);
                        pr4 pr4Var = snd.a;
                        aspectRatio = 0.5714286f;
                        if (!z2 && tarotSkinIdentify3 != null) {
                            aspectRatio = tarotSkinIdentify3.getAspectRatio();
                        }
                        j09 j09VarE = oa7.E(dj6.w(j09Var4, aspectRatio), a7c.b(f4));
                        if (qheVar.b == 0) {
                            f5 = 180.0f;
                        } else {
                            f5 = 0.0f;
                        }
                        j09 j09VarI = q6c.i(j09VarE, f5);
                        if (z2) {
                            bn2Var6 = an2.g;
                        } else {
                            bn2Var6 = bn2Var5;
                        }
                        feg.j(asyncImagePainterY, afc.q(r8c.f(qheVar), l46Var), j09VarI, null, bn2Var6, 0.0f, null, l46Var, 0, 104);
                        z6 = z8;
                        a26Var3 = a26Var2;
                        tarotSkinIdentify2 = tarotSkinIdentify3;
                        bn2Var3 = bn2Var5;
                        f3 = f4;
                        z5 = z2;
                        j09Var3 = j09Var4;
                    } else {
                        l46Var.Z();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                            i3 &= -29360129;
                        }
                        tarotSkinIdentify3 = tarotSkinIdentify;
                        j09Var4 = j09Var2;
                        f4 = f2;
                        bn2Var5 = bn2Var2;
                    }
                    z8 = z3;
                    l46Var.s();
                    if (z8) {
                        ykdVarC = ykd.c;
                    } else {
                        ykdVarC = xdc.c(120, 210);
                    }
                    x16Var = (x16) l46Var.k(o10.a);
                    Context context2 = (Context) l46Var.k(uq.b);
                    nfcVarB = kr7.b(l46Var);
                    zG = l46Var.g(null) | l46Var.g(nfcVarB);
                    Object objR5 = l46Var.R();
                    Object obj3 = sf2.a;
                    if (zG) {
                        obj = null;
                        objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                        l46Var.p0(objB);
                    } else {
                        obj = null;
                        objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                        l46Var.p0(objB);
                    }
                    kmd kmdVar2 = (kmd) objB;
                    nfcVarB2 = kr7.b(l46Var);
                    zG2 = l46Var.g(obj) | l46Var.g(nfcVarB2);
                    objR = l46Var.R();
                    if (zG2) {
                        objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                        l46Var.p0(objR);
                    } else {
                        objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                        l46Var.p0(objR);
                    }
                    whb whbVar2 = ((ys3) ((cmd) objR)).x;
                    e89 e89VarI2 = jzb.i(whbVar2, whbVar2.getValue(), l46Var, 0, 0);
                    if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                        z9 = false;
                        l46Var.f0(-630286969);
                        l46Var.r(false);
                        objR2 = objValueOf;
                    } else {
                        z9 = false;
                        l46Var.f0(-630286969);
                        l46Var.r(false);
                        objR2 = objValueOf;
                    }
                    aw6 aw6Var2 = (aw6) l46Var.k(n72.a);
                    pw6 pw6Var2 = new pw6(context2);
                    pw6Var2.c = objR2;
                    pw6Var2.i = m81.a;
                    pw6Var2.k = zdc.b;
                    pw6Var2.j = new tib(ykdVarC);
                    sw6 sw6VarA2 = pw6Var2.a();
                    if ((3670016 & i3) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    zG3 = z10 | l46Var.g(x16Var);
                    objR3 = l46Var.R();
                    if (zG3) {
                        objR3 = new slc(a26Var2, x16Var);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new slc(a26Var2, x16Var);
                        l46Var.p0(objR3);
                    }
                    AsyncImagePainter asyncImagePainterY2 = z7f.Y(sw6VarA2, aw6Var2, (a26) objR3, l46Var, 0, 52);
                    pr4 pr4Var2 = snd.a;
                    aspectRatio = 0.5714286f;
                    if (!z2) {
                        aspectRatio = tarotSkinIdentify3.getAspectRatio();
                    }
                    j09 j09VarE2 = oa7.E(dj6.w(j09Var4, aspectRatio), a7c.b(f4));
                    if (qheVar.b == 0) {
                        f5 = 180.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    j09 j09VarI2 = q6c.i(j09VarE2, f5);
                    if (z2) {
                        bn2Var6 = an2.g;
                    } else {
                        bn2Var6 = bn2Var5;
                    }
                    feg.j(asyncImagePainterY2, afc.q(r8c.f(qheVar), l46Var), j09VarI2, null, bn2Var6, 0.0f, null, l46Var, 0, 104);
                    z6 = z8;
                    a26Var3 = a26Var2;
                    tarotSkinIdentify2 = tarotSkinIdentify3;
                    bn2Var3 = bn2Var5;
                    f3 = f4;
                    z5 = z2;
                    j09Var3 = j09Var4;
                } else {
                    l46Var.Z();
                    tarotSkinIdentify2 = tarotSkinIdentify;
                    z5 = z2;
                    j09Var3 = j09Var2;
                    z6 = z3;
                    bn2Var3 = bn2Var2;
                    a26Var3 = a26Var2;
                    f3 = f2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: whe
                        @Override // defpackage.l26
                        public final Object z(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            o7c.d(j09Var3, qheVar, tarotSkinIdentify2, z6, bn2Var3, f3, a26Var3, z5, (l46) obj4, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            bn2Var2 = bn2Var;
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 196608) == 0) {
                    if (l46Var.d(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                a26Var2 = a26Var;
            } else {
                a26Var2 = a26Var;
                if ((i & 1572864) == 0) {
                    if (l46Var.i(a26Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0 || !l46Var.h(z2)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i3 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var2 = g09.a;
                    }
                    if ((i2 & 4) != 0) {
                        tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                        i3 &= -897;
                    } else {
                        tarotSkinIdentifyC = tarotSkinIdentify;
                    }
                    if (i12 != 0) {
                        z3 = true;
                    }
                    if (i4 != 0) {
                        bn2Var4 = an2.d;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i6 != 0) {
                        f2 = 16.0f;
                    }
                    if (i8 != 0) {
                        a26Var2 = null;
                    }
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        if (l46Var.k(snd.b) != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i3 &= -29360129;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                        z2 = z7;
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                    } else {
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                    }
                } else {
                    if (i11 != 0) {
                        j09Var2 = g09.a;
                    }
                    if ((i2 & 4) != 0) {
                        tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                        i3 &= -897;
                    } else {
                        tarotSkinIdentifyC = tarotSkinIdentify;
                    }
                    if (i12 != 0) {
                        z3 = true;
                    }
                    if (i4 != 0) {
                        bn2Var4 = an2.d;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i6 != 0) {
                        f2 = 16.0f;
                    }
                    if (i8 != 0) {
                        a26Var2 = null;
                    }
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        if (l46Var.k(snd.b) != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i3 &= -29360129;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                        z2 = z7;
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                    } else {
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                    }
                }
                l46Var.s();
                if (z8) {
                    ykdVarC = ykd.c;
                } else {
                    ykdVarC = xdc.c(120, 210);
                }
                x16Var = (x16) l46Var.k(o10.a);
                Context context3 = (Context) l46Var.k(uq.b);
                nfcVarB = kr7.b(l46Var);
                zG = l46Var.g(null) | l46Var.g(nfcVarB);
                Object objR6 = l46Var.R();
                Object obj4 = sf2.a;
                if (zG) {
                    obj = null;
                    objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                    l46Var.p0(objB);
                } else {
                    obj = null;
                    objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                    l46Var.p0(objB);
                }
                kmd kmdVar3 = (kmd) objB;
                nfcVarB2 = kr7.b(l46Var);
                zG2 = l46Var.g(obj) | l46Var.g(nfcVarB2);
                objR = l46Var.R();
                if (zG2) {
                    objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                    l46Var.p0(objR);
                } else {
                    objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                    l46Var.p0(objR);
                }
                whb whbVar3 = ((ys3) ((cmd) objR)).x;
                e89 e89VarI3 = jzb.i(whbVar3, whbVar3.getValue(), l46Var, 0, 0);
                if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                    z9 = false;
                    l46Var.f0(-630286969);
                    l46Var.r(false);
                    objR2 = objValueOf;
                } else {
                    z9 = false;
                    l46Var.f0(-630286969);
                    l46Var.r(false);
                    objR2 = objValueOf;
                }
                aw6 aw6Var3 = (aw6) l46Var.k(n72.a);
                pw6 pw6Var3 = new pw6(context3);
                pw6Var3.c = objR2;
                pw6Var3.i = m81.a;
                pw6Var3.k = zdc.b;
                pw6Var3.j = new tib(ykdVarC);
                sw6 sw6VarA3 = pw6Var3.a();
                if ((3670016 & i3) == 1048576) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                zG3 = z10 | l46Var.g(x16Var);
                objR3 = l46Var.R();
                if (zG3) {
                    objR3 = new slc(a26Var2, x16Var);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new slc(a26Var2, x16Var);
                    l46Var.p0(objR3);
                }
                AsyncImagePainter asyncImagePainterY3 = z7f.Y(sw6VarA3, aw6Var3, (a26) objR3, l46Var, 0, 52);
                pr4 pr4Var3 = snd.a;
                aspectRatio = 0.5714286f;
                if (!z2) {
                    aspectRatio = tarotSkinIdentify3.getAspectRatio();
                }
                j09 j09VarE3 = oa7.E(dj6.w(j09Var4, aspectRatio), a7c.b(f4));
                if (qheVar.b == 0) {
                    f5 = 180.0f;
                } else {
                    f5 = 0.0f;
                }
                j09 j09VarI3 = q6c.i(j09VarE3, f5);
                if (z2) {
                    bn2Var6 = an2.g;
                } else {
                    bn2Var6 = bn2Var5;
                }
                feg.j(asyncImagePainterY3, afc.q(r8c.f(qheVar), l46Var), j09VarI3, null, bn2Var6, 0.0f, null, l46Var, 0, 104);
                z6 = z8;
                a26Var3 = a26Var2;
                tarotSkinIdentify2 = tarotSkinIdentify3;
                bn2Var3 = bn2Var5;
                f3 = f4;
                z5 = z2;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                tarotSkinIdentify2 = tarotSkinIdentify;
                z5 = z2;
                j09Var3 = j09Var2;
                z6 = z3;
                bn2Var3 = bn2Var2;
                a26Var3 = a26Var2;
                f3 = f2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: whe
                    @Override // defpackage.l26
                    public final Object z(Object obj5, Object obj6) {
                        ((Integer) obj6).getClass();
                        o7c.d(j09Var3, qheVar, tarotSkinIdentify2, z6, bn2Var3, f3, a26Var3, z5, (l46) obj5, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                bn2Var2 = bn2Var;
                if (l46Var.g(bn2Var2)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 196608) == 0) {
                    if (l46Var.d(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                a26Var2 = a26Var;
            } else {
                a26Var2 = a26Var;
                if ((i & 1572864) == 0) {
                    if (l46Var.i(a26Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0 || !l46Var.h(z2)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i3 & 1, z4)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        j09Var2 = g09.a;
                    }
                    if ((i2 & 4) != 0) {
                        tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                        i3 &= -897;
                    } else {
                        tarotSkinIdentifyC = tarotSkinIdentify;
                    }
                    if (i12 != 0) {
                        z3 = true;
                    }
                    if (i4 != 0) {
                        bn2Var4 = an2.d;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i6 != 0) {
                        f2 = 16.0f;
                    }
                    if (i8 != 0) {
                        a26Var2 = null;
                    }
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        if (l46Var.k(snd.b) != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i3 &= -29360129;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                        z2 = z7;
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                    } else {
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                    }
                } else {
                    if (i11 != 0) {
                        j09Var2 = g09.a;
                    }
                    if ((i2 & 4) != 0) {
                        tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                        i3 &= -897;
                    } else {
                        tarotSkinIdentifyC = tarotSkinIdentify;
                    }
                    if (i12 != 0) {
                        z3 = true;
                    }
                    if (i4 != 0) {
                        bn2Var4 = an2.d;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i6 != 0) {
                        f2 = 16.0f;
                    }
                    if (i8 != 0) {
                        a26Var2 = null;
                    }
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        if (l46Var.k(snd.b) != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i3 &= -29360129;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                        z2 = z7;
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                    } else {
                        tarotSkinIdentify3 = tarotSkinIdentifyC;
                        j09Var4 = j09Var2;
                        bn2Var5 = bn2Var4;
                        f4 = f2;
                        z8 = z3;
                    }
                }
                l46Var.s();
                if (z8) {
                    ykdVarC = ykd.c;
                } else {
                    ykdVarC = xdc.c(120, 210);
                }
                x16Var = (x16) l46Var.k(o10.a);
                Context context4 = (Context) l46Var.k(uq.b);
                nfcVarB = kr7.b(l46Var);
                zG = l46Var.g(null) | l46Var.g(nfcVarB);
                Object objR7 = l46Var.R();
                Object obj5 = sf2.a;
                if (zG) {
                    obj = null;
                    objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                    l46Var.p0(objB);
                } else {
                    obj = null;
                    objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                    l46Var.p0(objB);
                }
                kmd kmdVar4 = (kmd) objB;
                nfcVarB2 = kr7.b(l46Var);
                zG2 = l46Var.g(obj) | l46Var.g(nfcVarB2);
                objR = l46Var.R();
                if (zG2) {
                    objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                    l46Var.p0(objR);
                } else {
                    objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                    l46Var.p0(objR);
                }
                whb whbVar4 = ((ys3) ((cmd) objR)).x;
                e89 e89VarI4 = jzb.i(whbVar4, whbVar4.getValue(), l46Var, 0, 0);
                if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                    z9 = false;
                    l46Var.f0(-630286969);
                    l46Var.r(false);
                    objR2 = objValueOf;
                } else {
                    z9 = false;
                    l46Var.f0(-630286969);
                    l46Var.r(false);
                    objR2 = objValueOf;
                }
                aw6 aw6Var4 = (aw6) l46Var.k(n72.a);
                pw6 pw6Var4 = new pw6(context4);
                pw6Var4.c = objR2;
                pw6Var4.i = m81.a;
                pw6Var4.k = zdc.b;
                pw6Var4.j = new tib(ykdVarC);
                sw6 sw6VarA4 = pw6Var4.a();
                if ((3670016 & i3) == 1048576) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                zG3 = z10 | l46Var.g(x16Var);
                objR3 = l46Var.R();
                if (zG3) {
                    objR3 = new slc(a26Var2, x16Var);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new slc(a26Var2, x16Var);
                    l46Var.p0(objR3);
                }
                AsyncImagePainter asyncImagePainterY4 = z7f.Y(sw6VarA4, aw6Var4, (a26) objR3, l46Var, 0, 52);
                pr4 pr4Var4 = snd.a;
                aspectRatio = 0.5714286f;
                if (!z2) {
                    aspectRatio = tarotSkinIdentify3.getAspectRatio();
                }
                j09 j09VarE4 = oa7.E(dj6.w(j09Var4, aspectRatio), a7c.b(f4));
                if (qheVar.b == 0) {
                    f5 = 180.0f;
                } else {
                    f5 = 0.0f;
                }
                j09 j09VarI4 = q6c.i(j09VarE4, f5);
                if (z2) {
                    bn2Var6 = an2.g;
                } else {
                    bn2Var6 = bn2Var5;
                }
                feg.j(asyncImagePainterY4, afc.q(r8c.f(qheVar), l46Var), j09VarI4, null, bn2Var6, 0.0f, null, l46Var, 0, 104);
                z6 = z8;
                a26Var3 = a26Var2;
                tarotSkinIdentify2 = tarotSkinIdentify3;
                bn2Var3 = bn2Var5;
                f3 = f4;
                z5 = z2;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                tarotSkinIdentify2 = tarotSkinIdentify;
                z5 = z2;
                j09Var3 = j09Var2;
                z6 = z3;
                bn2Var3 = bn2Var2;
                a26Var3 = a26Var2;
                f3 = f2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: whe
                    @Override // defpackage.l26
                    public final Object z(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        o7c.d(j09Var3, qheVar, tarotSkinIdentify2, z6, bn2Var3, f3, a26Var3, z5, (l46) obj6, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 24576;
        bn2Var2 = bn2Var;
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 196608) == 0) {
                if (l46Var.d(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            a26Var2 = a26Var;
        } else {
            a26Var2 = a26Var;
            if ((i & 1572864) == 0) {
                if (l46Var.i(a26Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        if ((i & 12582912) != 0) {
            i3 |= ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0 || !l46Var.h(z2)) ? 4194304 : 8388608;
        }
        if ((i3 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i3 & 1, z4)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    j09Var2 = g09.a;
                }
                if ((i2 & 4) != 0) {
                    tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                    i3 &= -897;
                } else {
                    tarotSkinIdentifyC = tarotSkinIdentify;
                }
                if (i12 != 0) {
                    z3 = true;
                }
                if (i4 != 0) {
                    bn2Var4 = an2.d;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i6 != 0) {
                    f2 = 16.0f;
                }
                if (i8 != 0) {
                    a26Var2 = null;
                }
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    if (l46Var.k(snd.b) != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i3 &= -29360129;
                    bn2Var5 = bn2Var4;
                    f4 = f2;
                    z8 = z3;
                    z2 = z7;
                    tarotSkinIdentify3 = tarotSkinIdentifyC;
                    j09Var4 = j09Var2;
                } else {
                    tarotSkinIdentify3 = tarotSkinIdentifyC;
                    j09Var4 = j09Var2;
                    bn2Var5 = bn2Var4;
                    f4 = f2;
                    z8 = z3;
                }
            } else {
                if (i11 != 0) {
                    j09Var2 = g09.a;
                }
                if ((i2 & 4) != 0) {
                    tarotSkinIdentifyC = snd.c(str, null, l46Var, 2);
                    i3 &= -897;
                } else {
                    tarotSkinIdentifyC = tarotSkinIdentify;
                }
                if (i12 != 0) {
                    z3 = true;
                }
                if (i4 != 0) {
                    bn2Var4 = an2.d;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i6 != 0) {
                    f2 = 16.0f;
                }
                if (i8 != 0) {
                    a26Var2 = null;
                }
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    if (l46Var.k(snd.b) != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i3 &= -29360129;
                    bn2Var5 = bn2Var4;
                    f4 = f2;
                    z8 = z3;
                    z2 = z7;
                    tarotSkinIdentify3 = tarotSkinIdentifyC;
                    j09Var4 = j09Var2;
                } else {
                    tarotSkinIdentify3 = tarotSkinIdentifyC;
                    j09Var4 = j09Var2;
                    bn2Var5 = bn2Var4;
                    f4 = f2;
                    z8 = z3;
                }
            }
            l46Var.s();
            if (z8) {
                ykdVarC = ykd.c;
            } else {
                ykdVarC = xdc.c(120, 210);
            }
            x16Var = (x16) l46Var.k(o10.a);
            Context context5 = (Context) l46Var.k(uq.b);
            nfcVarB = kr7.b(l46Var);
            zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR8 = l46Var.R();
            Object obj6 = sf2.a;
            if (zG) {
                obj = null;
                objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                l46Var.p0(objB);
            } else {
                obj = null;
                objB = nfcVarB.b(job.a.b(kmd.class), null, null);
                l46Var.p0(objB);
            }
            kmd kmdVar5 = (kmd) objB;
            nfcVarB2 = kr7.b(l46Var);
            zG2 = l46Var.g(obj) | l46Var.g(nfcVarB2);
            objR = l46Var.R();
            if (zG2) {
                objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                l46Var.p0(objR);
            } else {
                objR = nfcVarB2.b(job.a.b(cmd.class), null, null);
                l46Var.p0(objR);
            }
            whb whbVar5 = ((ys3) ((cmd) objR)).x;
            e89 e89VarI5 = jzb.i(whbVar5, whbVar5.getValue(), l46Var, 0, 0);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                z9 = false;
                l46Var.f0(-630286969);
                l46Var.r(false);
                objR2 = objValueOf;
            } else {
                z9 = false;
                l46Var.f0(-630286969);
                l46Var.r(false);
                objR2 = objValueOf;
            }
            aw6 aw6Var5 = (aw6) l46Var.k(n72.a);
            pw6 pw6Var5 = new pw6(context5);
            pw6Var5.c = objR2;
            pw6Var5.i = m81.a;
            pw6Var5.k = zdc.b;
            pw6Var5.j = new tib(ykdVarC);
            sw6 sw6VarA5 = pw6Var5.a();
            if ((3670016 & i3) == 1048576) {
                z10 = true;
            } else {
                z10 = z9;
            }
            zG3 = z10 | l46Var.g(x16Var);
            objR3 = l46Var.R();
            if (zG3) {
                objR3 = new slc(a26Var2, x16Var);
                l46Var.p0(objR3);
            } else {
                objR3 = new slc(a26Var2, x16Var);
                l46Var.p0(objR3);
            }
            AsyncImagePainter asyncImagePainterY5 = z7f.Y(sw6VarA5, aw6Var5, (a26) objR3, l46Var, 0, 52);
            pr4 pr4Var5 = snd.a;
            aspectRatio = 0.5714286f;
            if (!z2) {
                aspectRatio = tarotSkinIdentify3.getAspectRatio();
            }
            j09 j09VarE5 = oa7.E(dj6.w(j09Var4, aspectRatio), a7c.b(f4));
            if (qheVar.b == 0) {
                f5 = 180.0f;
            } else {
                f5 = 0.0f;
            }
            j09 j09VarI5 = q6c.i(j09VarE5, f5);
            if (z2) {
                bn2Var6 = an2.g;
            } else {
                bn2Var6 = bn2Var5;
            }
            feg.j(asyncImagePainterY5, afc.q(r8c.f(qheVar), l46Var), j09VarI5, null, bn2Var6, 0.0f, null, l46Var, 0, 104);
            z6 = z8;
            a26Var3 = a26Var2;
            tarotSkinIdentify2 = tarotSkinIdentify3;
            bn2Var3 = bn2Var5;
            f3 = f4;
            z5 = z2;
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            tarotSkinIdentify2 = tarotSkinIdentify;
            z5 = z2;
            j09Var3 = j09Var2;
            z6 = z3;
            bn2Var3 = bn2Var2;
            a26Var3 = a26Var2;
            f3 = f2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: whe
                @Override // defpackage.l26
                public final Object z(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    o7c.d(j09Var3, qheVar, tarotSkinIdentify2, z6, bn2Var3, f3, a26Var3, z5, (l46) obj7, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(int i, final int i2, l46 l46Var, final j09 j09Var, final List list) {
        ojb ojbVarV;
        l26 l26Var;
        final int i3 = i;
        l46Var.h0(429610690);
        int i4 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.e(i3) ? 32 : 16);
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            djc djcVar = (djc) s72.y0(i3, list);
            if (djcVar == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i6 = 0;
                l26Var = new l26(list, i3, j09Var, i2, i6) { // from class: rrc
                    public final /* synthetic */ int a;
                    public final /* synthetic */ List b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ j09 d;

                    {
                        this.a = i6;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i7 = this.a;
                        wef wefVar = wef.a;
                        j09 j09Var2 = this.d;
                        int i8 = this.c;
                        List list2 = this.b;
                        l46 l46Var2 = (l46) obj;
                        ((Integer) obj2).getClass();
                        switch (i7) {
                            case 0:
                                o7c.e(i8, k99.P(385), l46Var2, j09Var2, list2);
                                break;
                            default:
                                o7c.e(i8, k99.P(385), l46Var2, j09Var2, list2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                c92 c92VarA = a92.a(new uc0(20.0f, true, new qc0(i5)), ndb.Z, l46Var, 54);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09Var);
                lf2.q.getClass();
                l46Var.j0();
                boolean z = l46Var.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var, c92VarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf);
                dec.k(l46Var);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ);
                g09 g09Var = g09.a;
                j09 j09VarC = b.c(g09Var, 1.0f);
                pr4 pr4Var = l8b.a;
                j09 j09VarB0 = ynb.b0(0.0f, 24.0f, tm7.o(j09VarC, ((e8b) l46Var.k(pr4Var)).f, a7c.b(20.0f)), 1);
                uc0 uc0Var = new uc0(16.0f, true, new qc0(i5));
                jx0 jx0Var = ndb.Y;
                c92 c92VarA2 = a92.a(uc0Var, jx0Var, l46Var, 6);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA2);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                o5c.b(djcVar.a, i, ynb.b0(24.0f, 0.0f, g09Var, 2), l46Var, (i4 & 112) | 384, 0);
                i3 = i;
                g(djcVar, b.c(g09Var, 1.0f), l46Var, 56);
                l46Var.r(true);
                j09 j09VarZ = ynb.Z(tm7.o(b.c(g09Var, 1.0f), ((e8b) l46Var.k(pr4Var)).f, a7c.b(20.0f)), 20.0f);
                c92 c92VarA3 = a92.a(new uc0(16.0f, true, new qc0(0)), jx0Var, l46Var, 6);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarZ);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA3);
                dec.l(he2Var2, l46Var, u8aVarM3);
                ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ3);
                o5c.d(i3, (i4 >> 3) & 14, l46Var);
                z7f.g(0, 1, l46Var, null, djcVar.d);
                l46Var.r(true);
                i(null, l46Var, 0);
                l46Var.r(true);
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i7 = 1;
            l26Var = new l26(list, i3, j09Var, i2, i7) { // from class: rrc
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ j09 d;

                {
                    this.a = i7;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i8 = this.a;
                    wef wefVar = wef.a;
                    j09 j09Var2 = this.d;
                    int i9 = this.c;
                    List list2 = this.b;
                    l46 l46Var2 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i8) {
                        case 0:
                            o7c.e(i9, k99.P(385), l46Var2, j09Var2, list2);
                            break;
                        default:
                            o7c.e(i9, k99.P(385), l46Var2, j09Var2, list2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void f(final boolean z, final x16 x16Var, final fpc fpcVar, wrc wrcVar, l46 l46Var, final int i, final int i2) {
        int i3;
        final wrc wrcVar2;
        ojb ojbVarV;
        l26 l26Var;
        wrc wrcVar3 = wrcVar;
        x16Var.getClass();
        fpcVar.getClass();
        l46Var.h0(-1867797925);
        if ((i & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? l46Var.g(fpcVar) : l46Var.i(fpcVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? l46Var.g(wrcVar3) : l46Var.i(wrcVar3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                wrcVar3 = vrc.a;
            }
            int i5 = i3;
            final wrc wrcVar4 = wrcVar3;
            if (z) {
                int i6 = 6;
                ted tedVarF = zz8.f(6, 2, null, l46Var);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (objR == obj) {
                    objR = af1.E(l46Var);
                    l46Var.p0(objR);
                }
                aw2 aw2Var = (aw2) objR;
                j09 j09VarW = mh3.W(g09.a);
                long j = ((e8b) l46Var.k(l8b.a)).e;
                y6c y6cVarD = a7c.d(32.0f, 32.0f, 0.0f, 12);
                boolean zI = l46Var.i(aw2Var) | l46Var.g(tedVarF) | ((i5 & 112) == 32);
                Object objR2 = l46Var.R();
                if (zI || objR2 == obj) {
                    objR2 = new m50(aw2Var, tedVarF, x16Var, i6);
                    l46Var.p0(objR2);
                }
                zz8.a((x16) objR2, j09VarW, tedVarF, 0.0f, false, y6cVarD, j, 0L, 0L, vfh.k, new qdc(11), null, af1.b0(1299774269, new n50(aw2Var, tedVarF, x16Var, wrcVar4, fpcVar, 12), l46Var), l46Var, 0, 3078, 5016);
                wrcVar2 = wrcVar4;
            } else {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i7 = 0;
                l26Var = new l26() { // from class: prc
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        int i8 = i7;
                        wef wefVar = wef.a;
                        int i9 = i;
                        switch (i8) {
                            case 0:
                                ((Integer) obj3).getClass();
                                int iP = k99.P(i9 | 1);
                                o7c.f(z, x16Var, fpcVar, wrcVar4, (l46) obj2, iP, i2);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                int iP2 = k99.P(i9 | 1);
                                o7c.f(z, x16Var, fpcVar, wrcVar4, (l46) obj2, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        wrcVar2 = wrcVar3;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i8 = 1;
            l26Var = new l26() { // from class: prc
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i9 = i8;
                    wef wefVar = wef.a;
                    int i10 = i;
                    switch (i9) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iP = k99.P(i10 | 1);
                            o7c.f(z, x16Var, fpcVar, wrcVar2, (l46) obj2, iP, i2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iP2 = k99.P(i10 | 1);
                            o7c.f(z, x16Var, fpcVar, wrcVar2, (l46) obj2, iP2, i2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void g(djc djcVar, j09 j09Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2 = l46Var;
        qhe qheVar = djcVar.b;
        l46Var2.h0(-11895528);
        int i3 = i | (l46Var2.i(djcVar) ? 4 : 2);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            g09 g09Var = g09.a;
            d(b.p(g09Var, 88.0f), qheVar, null, false, null, 8.0f, null, false, l46Var2, 196614, 220);
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(i4)), ndb.z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            if (qheVar.b == 0) {
                l46Var2.f0(-452800187);
                j09 j09VarS = b.s(g09Var, ndb.f, 2);
                pr4 pr4Var = l8b.a;
                j09 j09VarA0 = ynb.a0(tm7.o(j09VarS, ((e8b) l46Var2.k(pr4Var)).m, a7c.b(2.0f)), 4.0f, 1.0f);
                String strQ = afc.q(R.string.seasonal_reading_reversed, l46Var2);
                mue mueVar = pue.a;
                nte.b(strQ, j09VarA0, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.h(l46Var2), l46Var, 0, 0, 130040);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-452393436);
                l46Var2.r(false);
            }
            String str = djcVar.c;
            mue mueVar2 = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.g(l46Var2), l46Var, 0, 24960, 109562);
            l46Var2 = l46Var;
            i2 = 1;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            i2 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fjc(djcVar, j09Var, i, i2);
        }
    }

    public static final void h(fpc fpcVar, j09 j09Var, l46 l46Var, int i) {
        fpcVar.getClass();
        l46Var.h0(-1657418811);
        int i2 = 4;
        int i3 = (l46Var.g(fpcVar) ? 4 : 2) | i;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            c92 c92VarA = a92.a(new uc0(20.0f, true, new qc0(i4)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String str = fpcVar.a;
            g09 g09Var = g09.a;
            q7c.c(str, b.c(g09Var, 1.0f), null, l46Var, 48, 4);
            rrb.b(fpcVar.b, b.c(g09Var, 1.0f), null, l46Var, 48, 4);
            q7c.b(fpcVar.c, b.c(g09Var, 1.0f), null, l46Var, 48, 4);
            i(null, l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(fpcVar, j09Var, i, i2);
        }
    }

    public static final void i(j09 j09Var, l46 l46Var, int i) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(345162918);
        int i2 = i | 6;
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i3)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            feg.j(od4.A(R.drawable.logo_quin, 0, l46Var2), null, b.d(g09Var, 36.0f), null, null, 0.0f, null, l46Var, 440, 120);
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 6.0f, 0.0f, 11, b.d(g09Var, 16.0f));
            pr4 pr4Var = l8b.a;
            oa7.n(j09VarD0, 0.5f, ((e8b) l46Var.k(pr4Var)).z, l46Var, 54, 0);
            String strQ = afc.q(R.string.seasonal_result_share_footer, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 6, j09Var2);
        }
    }

    public static final void j(c78 c78Var, SharedConversationEntryType sharedConversationEntryType, String str) {
        if (v4e.Q(str)) {
            return;
        }
        c78Var.add(new SharedConversationEntry(sharedConversationEntryType, str, (List) null, 4, (rp3) null));
    }

    public static final boolean k(tt7 tt7Var, j7f j7fVar, Set set) {
        boolean zK;
        if (pa7.t(tt7Var.c0(), j7fVar)) {
            return true;
        }
        y22 y22VarM = tt7Var.c0().m();
        z22 z22Var = y22VarM instanceof z22 ? (z22) y22VarM : null;
        List listH0 = z22Var != null ? z22Var.h0() : null;
        Iterable iterableQ1 = s72.q1(tt7Var.Z());
        if (!(iterableQ1 instanceof Collection) || !((Collection) iterableQ1).isEmpty()) {
            Iterator it = iterableQ1.iterator();
            do {
                iq4 iq4Var = (iq4) it;
                if (iq4Var.b.hasNext()) {
                    n17 n17Var = (n17) iq4Var.next();
                    int i = n17Var.a;
                    i8f i8fVar = (i8f) n17Var.b;
                    c8f c8fVar = listH0 != null ? (c8f) s72.y0(i, listH0) : null;
                    if ((c8fVar == null || set == null || !set.contains(c8fVar)) && !i8fVar.c()) {
                        tt7 tt7VarB = i8fVar.b();
                        tt7VarB.getClass();
                        zK = k(tt7VarB, j7fVar, set);
                    } else {
                        zK = false;
                    }
                }
            } while (!zK);
            return true;
        }
        return false;
    }

    public static final void l(df6 df6Var, lsf lsfVar) {
        ArrayList arrayList = lsfVar.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nsf nsfVar = (nsf) arrayList.get(i);
            if (nsfVar instanceof osf) {
                g1a g1aVar = new g1a();
                osf osfVar = (osf) nsfVar;
                g1aVar.d = osfVar.b;
                g1aVar.n = true;
                g1aVar.c();
                g1aVar.s.a.setFillType(osfVar.c == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                g1aVar.c();
                g1aVar.c();
                g1aVar.b = osfVar.d;
                g1aVar.c();
                g1aVar.c = osfVar.e;
                g1aVar.c();
                g1aVar.g = osfVar.f;
                g1aVar.c();
                g1aVar.e = osfVar.g;
                g1aVar.c();
                g1aVar.f = osfVar.v;
                g1aVar.o = true;
                g1aVar.c();
                g1aVar.h = osfVar.w;
                g1aVar.o = true;
                g1aVar.c();
                g1aVar.i = osfVar.x;
                g1aVar.o = true;
                g1aVar.c();
                g1aVar.j = osfVar.y;
                g1aVar.o = true;
                g1aVar.c();
                g1aVar.k = osfVar.z;
                g1aVar.p = true;
                g1aVar.c();
                g1aVar.l = osfVar.X;
                g1aVar.p = true;
                g1aVar.c();
                g1aVar.m = osfVar.Y;
                g1aVar.p = true;
                g1aVar.c();
                df6Var.e(i, g1aVar);
            } else if (nsfVar instanceof lsf) {
                df6 df6Var2 = new df6();
                lsf lsfVar2 = (lsf) nsfVar;
                df6Var2.k = lsfVar2.a;
                df6Var2.c();
                df6Var2.l = lsfVar2.b;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.o = lsfVar2.e;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.p = lsfVar2.f;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.q = lsfVar2.g;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.r = lsfVar2.v;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.m = lsfVar2.c;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.n = lsfVar2.d;
                df6Var2.s = true;
                df6Var2.c();
                df6Var2.f = lsfVar2.w;
                df6Var2.g = true;
                df6Var2.c();
                l(df6Var2, lsfVar2);
                df6Var.e(i, df6Var2);
            }
        }
    }

    public static final dzd m(tt7 tt7Var, dsf dsfVar, c8f c8fVar) {
        tt7Var.getClass();
        if ((c8fVar != null ? c8fVar.x() : null) == dsfVar) {
            dsfVar = dsf.INVARIANT;
        }
        return new dzd(tt7Var, dsfVar);
    }

    public static final hue n(l46 l46Var) {
        pr4 pr4Var = o82.a;
        return new hue(y72.b(((m82) l46Var.k(pr4Var)).a, 0.8f), y72.b(((m82) l46Var.k(pr4Var)).q, 0.2f));
    }

    public static final void o(tt7 tt7Var, tjd tjdVar, LinkedHashSet linkedHashSet, Set set) {
        y22 y22VarM = tt7Var.c0().m();
        if (y22VarM instanceof c8f) {
            if (!pa7.t(tt7Var.c0(), tjdVar.c0())) {
                linkedHashSet.add(y22VarM);
                return;
            }
            for (tt7 tt7Var2 : ((c8f) y22VarM).getUpperBounds()) {
                tt7Var2.getClass();
                o(tt7Var2, tjdVar, linkedHashSet, set);
            }
            return;
        }
        y22 y22VarM2 = tt7Var.c0().m();
        z22 z22Var = y22VarM2 instanceof z22 ? (z22) y22VarM2 : null;
        List listH0 = z22Var != null ? z22Var.h0() : null;
        int i = 0;
        for (i8f i8fVar : tt7Var.Z()) {
            int i2 = i + 1;
            c8f c8fVar = listH0 != null ? (c8f) s72.y0(i, listH0) : null;
            if ((c8fVar == null || set == null || !set.contains(c8fVar)) && !i8fVar.c() && !s72.o0(linkedHashSet, i8fVar.b().c0().m()) && !pa7.t(i8fVar.b().c0(), tjdVar.c0())) {
                tt7 tt7VarB = i8fVar.b();
                tt7VarB.getClass();
                o(tt7VarB, tjdVar, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final xr7 p(tt7 tt7Var) {
        tt7Var.getClass();
        xr7 xr7VarF = tt7Var.c0().f();
        xr7VarF.getClass();
        return xr7VarF;
    }

    public static final tt7 q(c8f c8fVar) {
        Object obj;
        List upperBounds = c8fVar.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = c8fVar.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            y22 y22VarM = ((tt7) next).c0().m();
            u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
            if (u09Var != null && u09Var.E() != l22.INTERFACE && u09Var.E() != l22.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        tt7 tt7Var = (tt7) obj;
        if (tt7Var != null) {
            return tt7Var;
        }
        List upperBounds3 = c8fVar.getUpperBounds();
        upperBounds3.getClass();
        Object objV0 = s72.v0(upperBounds3);
        objV0.getClass();
        return (tt7) objV0;
    }

    public static final r7c r(tn8 tn8Var) {
        Object objE = tn8Var.E();
        if (objE instanceof r7c) {
            return (r7c) objE;
        }
        return null;
    }

    public static final float s(r7c r7cVar) {
        if (r7cVar != null) {
            return r7cVar.a;
        }
        return 0.0f;
    }

    public static final boolean t(c8f c8fVar, j7f j7fVar, Set set) {
        c8fVar.getClass();
        List<tt7> upperBounds = c8fVar.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (tt7 tt7Var : upperBounds) {
            tt7Var.getClass();
            if (k(tt7Var, c8fVar.S().c0(), set) && (j7fVar == null || pa7.t(tt7Var.c0(), j7fVar))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean u(tt7 tt7Var, tt7 tt7Var2) {
        tt7Var.getClass();
        tt7Var2.getClass();
        return vt7.a.b(tt7Var, tt7Var2);
    }

    public static jgf v(jgf jgfVar) {
        jgfVar.getClass();
        kv3 kv3VarK0 = qfc.K0(jgfVar, false);
        if (kv3VarK0 != null) {
            return kv3VarK0;
        }
        tjd tjdVarW = w(jgfVar);
        return tjdVarW != null ? tjdVarW : jgfVar.l0(false);
    }

    public static final tjd w(jgf jgfVar) {
        ca7 ca7Var;
        j7f j7fVarC0 = jgfVar.c0();
        ca7 ca7Var2 = j7fVarC0 instanceof ca7 ? (ca7) j7fVarC0 : null;
        if (ca7Var2 != null) {
            LinkedHashSet<tt7> linkedHashSet = ca7Var2.b;
            ArrayList arrayList = new ArrayList(t72.u(linkedHashSet, 10));
            boolean z = false;
            for (tt7 tt7VarV : linkedHashSet) {
                if (w8f.e(tt7VarV)) {
                    tt7VarV = v(tt7VarV.k0());
                    z = true;
                }
                arrayList.add(tt7VarV);
            }
            if (z) {
                tt7 tt7VarV2 = ca7Var2.a;
                if (tt7VarV2 == null) {
                    tt7VarV2 = null;
                } else if (w8f.e(tt7VarV2)) {
                    tt7VarV2 = v(tt7VarV2.k0());
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                ca7Var = new ca7(linkedHashSet2);
                ca7Var.a = tt7VarV2;
            } else {
                ca7Var = null;
            }
            if (ca7Var != null) {
                return ca7Var.a();
            }
        }
        return null;
    }

    public static final VectorPainter x(gx6 gx6Var, l46 l46Var) {
        sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        boolean zF = l46Var.f((((long) Float.floatToRawIntBits(sw3Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(gx6Var.j)) << 32));
        Object objR = l46Var.R();
        if (zF || objR == sf2.a) {
            df6 df6Var = new df6();
            l(df6Var, gx6Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(sw3Var.p0(gx6Var.b))) << 32) | (((long) Float.floatToRawIntBits(sw3Var.p0(gx6Var.c))) & 4294967295L);
            float fIntBitsToFloat = gx6Var.d;
            float fIntBitsToFloat2 = gx6Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            VectorPainter vectorPainter = new VectorPainter(df6Var);
            String str = gx6Var.a;
            long j = gx6Var.g;
            xz0 xz0Var = j != 16 ? new xz0(j, gx6Var.h) : null;
            boolean z = gx6Var.i;
            vectorPainter.f.setValue(new ald(jFloatToRawIntBits));
            vectorPainter.g.setValue(Boolean.valueOf(z));
            jsf jsfVar = vectorPainter.v;
            jsfVar.g.setValue(xz0Var);
            jsfVar.i.setValue(new ald(jFloatToRawIntBits2));
            jsfVar.c = str;
            l46Var.p0(vectorPainter);
            objR = vectorPainter;
        }
        return (VectorPainter) objR;
    }

    public static final tt7 y(tt7 tt7Var, h10 h10Var) {
        return (tt7Var.getAnnotations().isEmpty() && h10Var.isEmpty()) ? tt7Var : tt7Var.k0().n0(jzb.n(tt7Var.a0(), h10Var));
    }

    public static final jgf z(tt7 tt7Var) {
        tjd tjdVar;
        jgf jgfVarU;
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof bj5) {
            bj5 bj5Var = (bj5) jgfVarK0;
            tjd tjdVarU = bj5Var.b;
            if (!tjdVarU.c0().getParameters().isEmpty() && tjdVarU.c0().m() != null) {
                List parameters = tjdVarU.c0().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dzd((c8f) it.next()));
                }
                tjdVarU = w6c.u(tjdVarU, arrayList, null, 2);
            }
            tjd tjdVarU2 = bj5Var.c;
            if (!tjdVarU2.c0().getParameters().isEmpty() && tjdVarU2.c0().m() != null) {
                List parameters2 = tjdVarU2.c0().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(t72.u(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new dzd((c8f) it2.next()));
                }
                tjdVarU2 = w6c.u(tjdVarU2, arrayList2, null, 2);
            }
            jgfVarU = rxg.E(tjdVarU, tjdVarU2);
        } else {
            if (!(jgfVarK0 instanceof tjd)) {
                ap.c();
                return null;
            }
            tjdVar = (tjd) jgfVarK0;
            if (!tjdVar.c0().getParameters().isEmpty() && tjdVar.c0().m() != null) {
                jgfVarU = tjdVar;
                jgfVarU = tjdVar;
                List parameters3 = tjdVar.c0().getParameters();
                parameters3.getClass();
                ArrayList arrayList3 = new ArrayList(t72.u(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new dzd((c8f) it3.next()));
                }
                jgfVarU = w6c.u(tjdVar, arrayList3, null, 2);
            }
        }
        jgfVarU = tjdVar;
        jgfVarU = tjdVar;
        jgfVarU = tjdVar;
        return q7c.p(jgfVarU, jgfVarK0);
    }

    public abstract void A(boolean z);

    public abstract void B(boolean z);
}
