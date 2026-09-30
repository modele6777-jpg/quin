package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zq implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final j1 X;
    public final AndroidComposeView a;
    public final hl b;
    public dm2 c;
    public final ArrayList d = new ArrayList();
    public vq e = vq.a;
    public boolean f = true;
    public final r41 g = urg.a(1, null, null, 6);
    public q69 v;
    public long w;
    public final q69 x;
    public zwc y;
    public boolean z;

    public zq(AndroidComposeView androidComposeView, hl hlVar) {
        this.a = androidComposeView;
        this.b = hlVar;
        new Handler(Looper.getMainLooper());
        q69 q69Var = v67.a;
        q69Var.getClass();
        this.v = q69Var;
        this.x = new q69();
        this.y = new zwc(androidComposeView.getSemanticsOwner().a(), q69Var);
        this.X = new j1(4, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (defpackage.vfh.q(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.zn2 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.yq
            if (r0 == 0) goto L13
            r0 = r9
            yq r0 = (defpackage.yq) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            yq r0 = new yq
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r1 = r0.L$0
            k41 r1 = (defpackage.k41) r1
            defpackage.jzb.q(r9)
        L2d:
            r9 = r1
            goto L48
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L36:
            java.lang.Object r1 = r0.L$0
            k41 r1 = (defpackage.k41) r1
            defpackage.jzb.q(r9)
            goto L56
        L3e:
            defpackage.jzb.q(r9)
            k41 r9 = new k41
            r41 r1 = r8.g
            r9.<init>(r1)
        L48:
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r1 = r9.b(r0)
            if (r1 != r4) goto L53
            goto L89
        L53:
            r7 = r1
            r1 = r9
            r9 = r7
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r1.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L6a
            r8.e()
        L6a:
            androidx.compose.ui.platform.AndroidComposeView r9 = r8.a
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.z
            if (r5 != 0) goto L7d
            if (r9 == 0) goto L7d
            r8.z = r3
            j1 r5 = r8.X
            r9.post(r5)
        L7d:
            r0.L$0 = r1
            r0.label = r2
            r5 = 100
            java.lang.Object r9 = defpackage.vfh.q(r5, r0)
            if (r9 != r4) goto L2d
        L89:
            return r4
        L8a:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq.a(zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void b(u67 u67Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        u67 u67Var2 = u67Var;
        int[] iArr3 = u67Var2.b;
        long[] jArr = u67Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        zwc zwcVar = (zwc) this.x.b(i7);
                        axc axcVar = (axc) u67Var2.b(i7);
                        ywc ywcVar = axcVar != null ? axcVar.a : null;
                        if (ywcVar == null) {
                            throw kv2.d("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = ywcVar.f;
                        w79 w79Var = ywcVar.d.a;
                        if (zwcVar == null) {
                            Object[] objArr = w79Var.b;
                            long[] jArr2 = w79Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                gxc gxcVar = (gxc) objArr[(i10 << 3) + i12];
                                                gxc gxcVar2 = cxc.C;
                                                if (pa7.t(gxcVar, gxcVar2)) {
                                                    Object objG = w79Var.g(gxcVar2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    g(i8, String.valueOf(list != null ? (k00) s72.x0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = w79Var.b;
                            long[] jArr3 = w79Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                gxc gxcVar3 = (gxc) objArr2[(i13 << 3) + i15];
                                                gxc gxcVar4 = cxc.C;
                                                if (pa7.t(gxcVar3, gxcVar4)) {
                                                    Object objG2 = zwcVar.a.a.g(gxcVar4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    k00 k00Var = list2 != null ? (k00) s72.x0(list2) : null;
                                                    Object objG3 = w79Var.g(gxcVar4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    k00 k00Var2 = list3 != null ? (k00) s72.x0(list3) : null;
                                                    if (!pa7.t(k00Var, k00Var2)) {
                                                        g(i8, String.valueOf(k00Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    u67Var2 = u67Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            u67Var2 = u67Var;
            iArr3 = iArr;
        }
    }

    public final u67 c() {
        if (this.f) {
            this.f = false;
            this.v = x57.P(this.a.getSemanticsOwner(), new z4(24));
            this.w = System.currentTimeMillis();
        }
        return this.v;
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e() {
        dm2 dm2Var = this.c;
        if (dm2Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                am2 am2Var = (am2) arrayList.get(i);
                int iOrdinal = am2Var.c.ordinal();
                if (iOrdinal == 0) {
                    oid oidVar = am2Var.d;
                    if (oidVar != null) {
                        ((cm2) dm2Var).d((ViewStructure) oidVar.b);
                    }
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return;
                    }
                    cm2 cm2Var = (cm2) dm2Var;
                    AutofillId autofillIdB = cm2Var.b(am2Var.a);
                    if (autofillIdB != null) {
                        cm2Var.e(autofillIdB);
                    }
                }
            }
            ((cm2) dm2Var).a();
            arrayList.clear();
        }
    }

    public final void f(ywc ywcVar, zwc zwcVar) {
        h8 h8Var = new h8(2, zwcVar, this);
        ywcVar.getClass();
        List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listI.get(i2);
            if (c().a(((ywc) obj).f)) {
                h8Var.z(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listI2 = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ywc ywcVar2 = (ywc) listI2.get(i3);
            u67 u67VarC = c();
            int i4 = ywcVar2.f;
            if (u67VarC.a(i4)) {
                q69 q69Var = this.x;
                if (q69Var.a(i4)) {
                    Object objB = q69Var.b(i4);
                    if (objB == null) {
                        throw kv2.d("node not present in pruned tree before this change");
                    }
                    f(ywcVar2, (zwc) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i, String str) {
        dm2 dm2Var;
        if (Build.VERSION.SDK_INT >= 29 && (dm2Var = this.c) != null) {
            cm2 cm2Var = (cm2) dm2Var;
            AutofillId autofillIdB = cm2Var.b(i);
            if (autofillIdB == null) {
                throw kv2.d("Invalid content capture ID");
            }
            cm2Var.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a A[PHI: r5
  0x009a: PHI (r5v6 android.view.autofill.AutofillId) = (r5v5 android.view.autofill.AutofillId), (r5v19 android.view.autofill.AutofillId) binds: [B:39:0x008b, B:41:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x0179  */
    /* JADX WARN: Code duplicated, block: B:99:0x017c  */
    public final void i(int i, ywc ywcVar) {
        a26 a26Var;
        oid oidVarC;
        ViewStructure viewStructure;
        twc twcVar;
        gxc gxcVar;
        w79 w79Var;
        Bundle extras;
        Object objG;
        String str;
        Object objG2;
        Object objG3;
        List list;
        Object objG4;
        k00 k00Var;
        Object objG5;
        List list2;
        Object objG6;
        i5c i5cVar;
        ste steVarC;
        yf9 yf9VarD;
        hkb hkbVarA;
        oid oidVar;
        yf9 yf9Var;
        String strL;
        a26 a26Var2;
        if (d()) {
            w79 w79Var2 = ywcVar.d.a;
            Object objG7 = w79Var2.g(cxc.E);
            if (objG7 == null) {
                objG7 = null;
            }
            Boolean bool = (Boolean) objG7;
            if (this.e == vq.a && pa7.t(bool, Boolean.TRUE)) {
                Object objG8 = w79Var2.g(swc.m);
                if (objG8 == null) {
                    objG8 = null;
                }
                f6 f6Var = (f6) objG8;
                if (f6Var != null && (a26Var2 = (a26) f6Var.b) != null) {
                }
            } else if (this.e == vq.b && pa7.t(bool, Boolean.FALSE)) {
                Object objG9 = w79Var2.g(swc.m);
                if (objG9 == null) {
                    objG9 = null;
                }
                f6 f6Var2 = (f6) objG9;
                if (f6Var2 != null && (a26Var = (a26) f6Var2.b) != null) {
                }
            }
            int i2 = ywcVar.f;
            dm2 dm2Var = this.c;
            if (dm2Var != null && Build.VERSION.SDK_INT >= 29) {
                AutofillId autofillId = this.a.getAutofillId();
                ywc ywcVarL = ywcVar.l();
                int i3 = ywcVar.f;
                if (ywcVarL != null) {
                    autofillId = ((cm2) dm2Var).b(ywcVarL.f);
                    if (autofillId == null) {
                        oidVar = null;
                    } else {
                        oidVarC = ((cm2) dm2Var).c(autofillId, i3);
                        if (oidVarC == null) {
                            oidVar = null;
                        } else {
                            viewStructure = (ViewStructure) oidVarC.b;
                            twcVar = ywcVar.d;
                            gxcVar = cxc.N;
                            w79Var = twcVar.a;
                            if (w79Var.c(gxcVar)) {
                                oidVar = null;
                            } else {
                                extras = viewStructure.getExtras();
                                if (extras != null) {
                                    extras.putLong("android.view.contentcapture.EventTimestamp", this.w);
                                    extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                                }
                                objG = w79Var.g(cxc.A);
                                if (objG == null) {
                                    objG = null;
                                }
                                str = (String) objG;
                                if (str != null) {
                                    viewStructure.setId(i3, null, null, str);
                                }
                                objG2 = w79Var.g(cxc.n);
                                if (objG2 == null) {
                                    objG2 = null;
                                }
                                if (((Boolean) objG2) != null) {
                                    viewStructure.setClassName("android.widget.ViewGroup");
                                }
                                objG3 = w79Var.g(cxc.C);
                                if (objG3 == null) {
                                    objG3 = null;
                                }
                                list = (List) objG3;
                                if (list != null) {
                                    viewStructure.setClassName("android.widget.TextView");
                                    viewStructure.setText(k88.a(list, "\n", null, 62));
                                }
                                objG4 = w79Var.g(cxc.G);
                                if (objG4 == null) {
                                    objG4 = null;
                                }
                                k00Var = (k00) objG4;
                                if (k00Var != null) {
                                    viewStructure.setClassName("android.widget.EditText");
                                    viewStructure.setText(k00Var);
                                }
                                objG5 = w79Var.g(cxc.a);
                                if (objG5 == null) {
                                    objG5 = null;
                                }
                                list2 = (List) objG5;
                                if (list2 != null) {
                                    viewStructure.setContentDescription(k88.a(list2, "\n", null, 62));
                                }
                                objG6 = w79Var.g(cxc.z);
                                if (objG6 == null) {
                                    objG6 = null;
                                }
                                i5cVar = (i5c) objG6;
                                if (i5cVar != null && (strL = ndc.l(i5cVar.a)) != null) {
                                    viewStructure.setClassName(strL);
                                }
                                steVarC = ndc.c(twcVar);
                                if (steVarC != null) {
                                    rte rteVar = steVarC.a;
                                    mue mueVar = rteVar.b;
                                    sw3 sw3Var = rteVar.g;
                                    viewStructure.setTextStyle(sw3Var.h0() * sw3Var.getDensity() * wue.c(mueVar.a.b), 0, 0, 0);
                                }
                                yf9VarD = ywcVar.d();
                                if (yf9VarD == null) {
                                    hkbVarA = hkb.e;
                                } else {
                                    yf9Var = yf9VarD.h1().Y ? yf9VarD : null;
                                    if (yf9Var != null) {
                                        hkbVarA = ywcVar.a(yf9Var);
                                    } else {
                                        hkbVarA = hkb.e;
                                    }
                                }
                                float f = hkbVarA.a;
                                float f2 = hkbVarA.b;
                                viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (hkbVarA.c - f), (int) (hkbVarA.d - f2));
                                oidVar = oidVarC;
                            }
                        }
                    }
                } else {
                    oidVarC = ((cm2) dm2Var).c(autofillId, i3);
                    if (oidVarC == null) {
                        oidVar = null;
                    } else {
                        viewStructure = (ViewStructure) oidVarC.b;
                        twcVar = ywcVar.d;
                        gxcVar = cxc.N;
                        w79Var = twcVar.a;
                        if (w79Var.c(gxcVar)) {
                            oidVar = null;
                        } else {
                            extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.w);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            objG = w79Var.g(cxc.A);
                            if (objG == null) {
                                objG = null;
                            }
                            str = (String) objG;
                            if (str != null) {
                                viewStructure.setId(i3, null, null, str);
                            }
                            objG2 = w79Var.g(cxc.n);
                            if (objG2 == null) {
                                objG2 = null;
                            }
                            if (((Boolean) objG2) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            objG3 = w79Var.g(cxc.C);
                            if (objG3 == null) {
                                objG3 = null;
                            }
                            list = (List) objG3;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(k88.a(list, "\n", null, 62));
                            }
                            objG4 = w79Var.g(cxc.G);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            k00Var = (k00) objG4;
                            if (k00Var != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(k00Var);
                            }
                            objG5 = w79Var.g(cxc.a);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            list2 = (List) objG5;
                            if (list2 != null) {
                                viewStructure.setContentDescription(k88.a(list2, "\n", null, 62));
                            }
                            objG6 = w79Var.g(cxc.z);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            i5cVar = (i5c) objG6;
                            if (i5cVar != null) {
                                viewStructure.setClassName(strL);
                            }
                            steVarC = ndc.c(twcVar);
                            if (steVarC != null) {
                                rte rteVar2 = steVarC.a;
                                mue mueVar2 = rteVar2.b;
                                sw3 sw3Var2 = rteVar2.g;
                                viewStructure.setTextStyle(sw3Var2.h0() * sw3Var2.getDensity() * wue.c(mueVar2.a.b), 0, 0, 0);
                            }
                            yf9VarD = ywcVar.d();
                            if (yf9VarD == null) {
                                hkbVarA = hkb.e;
                            } else {
                                if (yf9VarD.h1().Y) {
                                }
                                if (yf9Var != null) {
                                    hkbVarA = ywcVar.a(yf9Var);
                                } else {
                                    hkbVarA = hkb.e;
                                }
                            }
                            float f3 = hkbVarA.a;
                            float f4 = hkbVarA.b;
                            viewStructure.setDimens((int) f3, (int) f4, 0, 0, (int) (hkbVarA.c - f3), (int) (hkbVarA.d - f4));
                            oidVar = oidVarC;
                        }
                    }
                }
            } else {
                oidVar = null;
            }
            if (oidVar != null) {
                this.d.add(new am2(i2, this.w, bm2.a, oidVar));
            }
            List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
            int size = listI.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listI.get(i5);
                if (c().a(((ywc) obj).f)) {
                    i(i4, (ywc) obj);
                    i4++;
                }
            }
        }
    }

    public final void j(ywc ywcVar) {
        if (d()) {
            this.d.add(new am2(ywcVar.f, this.w, bm2.b, null));
            List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                j((ywc) listI.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void k() {
        q69 q69Var = this.x;
        q69Var.c();
        u67 u67VarC = c();
        int[] iArr = u67VarC.b;
        Object[] objArr = u67VarC.c;
        long[] jArr = u67VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            q69Var.i(iArr[i4], new zwc(((axc) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.y = new zwc(this.a.getSemanticsOwner().a(), c());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(x48 x48Var) {
        this.c = (dm2) this.b.invoke();
        i(-1, this.a.getSemanticsOwner().a());
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(x48 x48Var) {
        j(this.a.getSemanticsOwner().a());
        e();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.X);
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
