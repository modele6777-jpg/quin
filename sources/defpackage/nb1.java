package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nb1 implements vd1 {
    public final qwe a;
    public final gd1 b;
    public final qd1 c;
    public final z1b d;
    public final ssg e;
    public final Object f;
    public final LinkedHashSet g;

    public nb1(qwe qweVar, gd1 gd1Var, qd1 qd1Var, z1b z1bVar, ssg ssgVar, Context context) {
        qweVar.getClass();
        gd1Var.getClass();
        qd1Var.getClass();
        z1bVar.getClass();
        this.a = qweVar;
        this.b = gd1Var;
        this.c = qd1Var;
        this.d = z1bVar;
        this.e = ssgVar;
        this.f = new Object();
        this.g = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x014d A[SYNTHETIC] */
    public final Object a(uf1 uf1Var, zn2 zn2Var) throws Exception {
        lb1 lb1Var;
        uf1 uf1Var2;
        jf1 jf1Var;
        SessionConfiguration sessionConfiguration;
        OutputConfiguration outputConfiguration;
        md1 md1Var;
        CaptureRequest.Builder builderA;
        Integer num;
        Object key;
        Object value;
        CaptureRequest.Key key2;
        uf1 uf1Var3 = uf1Var;
        if (zn2Var instanceof lb1) {
            lb1Var = (lb1) zn2Var;
            int i = lb1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lb1Var.label = i - Integer.MIN_VALUE;
            } else {
                lb1Var = new lb1(this, zn2Var);
            }
        } else {
            lb1Var = new lb1(this, zn2Var);
        }
        Object objA = lb1Var.result;
        int i2 = lb1Var.label;
        gd1 gd1Var = this.b;
        int i3 = 1;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objA);
            if (Build.VERSION.SDK_INT < 35) {
                return new fi2(0);
            }
            String str = uf1Var3.a;
            lb1Var.L$0 = uf1Var3;
            lb1Var.label = 1;
            objA = gd1Var.a(str, lb1Var);
            if (objA != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            uf1Var3 = (uf1) lb1Var.L$0;
            jzb.q(objA);
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sessionConfiguration = (SessionConfiguration) lb1Var.L$2;
            jf1Var = (jf1) lb1Var.L$1;
            uf1Var2 = (uf1) lb1Var.L$0;
            jzb.q(objA);
        }
        md1Var = (md1) objA;
        if (md1Var != null) {
            builderA = ((ld1) md1Var).a(uf1Var2.f);
        } else {
            builderA = null;
        }
        if (builderA != null) {
            for (Map.Entry entry : uf1Var2.g.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (key instanceof CaptureRequest.Key) {
                    key2 = (CaptureRequest.Key) key;
                } else {
                    key2 = null;
                }
                if (key2 != null) {
                    builderA.set(key2, value);
                }
            }
            CaptureRequest captureRequestBuild = builderA.build();
            captureRequestBuild.getClass();
            s.f0(sessionConfiguration, captureRequestBuild);
        }
        if (jf1Var != null) {
            num = new Integer(jf1Var.a(sessionConfiguration).b);
        } else {
            num = null;
        }
        return num != null ? new fi2(num.intValue()) : new fi2(0);
        jf1 jf1Var2 = (jf1) objA;
        int i4 = uf1Var3.h;
        String str2 = uf1Var3.a;
        if (i4 == 0) {
            i3 = 0;
        } else if (i4 != 1) {
            if (i4 == 2) {
                Log.i("CXCP", "Unsupported session mode: " + ((Object) kn2.b0(uf1Var3.h)));
                return new fi2(0);
            }
            i3 = i4;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = uf1Var3.b.iterator();
        while (it.hasNext()) {
            for (yt9 yt9Var : ((wj1) it.next()).a) {
                int i5 = yt9Var.b;
                String str3 = yt9Var.c;
                ot otVarA0 = qfc.A0(null, Integer.valueOf(i5), af8.P0, yt9Var.d, yt9Var.e, yt9Var.f, yt9Var.h, yt9Var.a, false, 0, !(str3 == null ? false : str3.equals(str2)) ? str3 : null, 1536);
                if (otVarA0 != null && (outputConfiguration = (OutputConfiguration) otVarA0.H0(job.a.b(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        SessionConfiguration sessionConfigurationB = u60.b(i3, s72.j1(linkedHashSet));
        lb1Var.L$0 = uf1Var3;
        lb1Var.L$1 = jf1Var2;
        lb1Var.L$2 = sessionConfigurationB;
        lb1Var.label = 2;
        Object objB = gd1Var.b(str2, lb1Var);
        if (objB != bw2Var) {
            uf1Var2 = uf1Var3;
            jf1Var = jf1Var2;
            objA = objB;
            sessionConfiguration = sessionConfigurationB;
            md1Var = (md1) objA;
            if (md1Var != null) {
                builderA = ((ld1) md1Var).a(uf1Var2.f);
            } else {
                builderA = null;
            }
            if (builderA != null) {
                while (r3.hasNext()) {
                    key = entry.getKey();
                    value = entry.getValue();
                    if (key instanceof CaptureRequest.Key) {
                        key2 = (CaptureRequest.Key) key;
                    } else {
                        key2 = null;
                    }
                    if (key2 != null) {
                        builderA.set(key2, value);
                    }
                }
                CaptureRequest captureRequestBuild2 = builderA.build();
                captureRequestBuild2.getClass();
                s.f0(sessionConfiguration, captureRequestBuild2);
            }
            if (jf1Var != null) {
                num = new Integer(jf1Var.a(sessionConfiguration).b);
            } else {
                num = null;
            }
            if (num != null) {
            }
        }
        return bw2Var;
    }
}
