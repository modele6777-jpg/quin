package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fp implements lf1 {
    public final yg1 a;
    public final CameraDevice b;
    public final String c;
    public final nd1 d;
    public final a90 e;
    public final qwe f;
    public final sh0 g;
    public final zh0 v;

    public fp(yg1 yg1Var, CameraDevice cameraDevice, String str, nd1 nd1Var, a90 a90Var, qwe qweVar) {
        yg1Var.getClass();
        str.getClass();
        nd1Var.getClass();
        qweVar.getClass();
        this.a = yg1Var;
        this.b = cameraDevice;
        this.c = str;
        this.d = nd1Var;
        this.e = a90Var;
        this.f = qweVar;
        this.g = vpf.m(false);
        this.v = vpf.o(null);
    }

    @Override // defpackage.lf1
    public final CaptureRequest.Builder E(TotalCaptureResult totalCaptureResult) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            nd1 nd1Var = this.d;
            try {
                builderCreateReprocessCaptureRequest = this.b.createReprocessCaptureRequest(totalCaptureResult);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i = 3;
                        } else if (reason == 2) {
                            i = 6;
                        } else if (reason != 3) {
                            if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        nd1Var.a(i, str, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        nd1Var.a(9, str, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateReprocessCaptureRequest = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.lf1
    public final void F0() {
        if (!this.g.b()) {
            qc0.p("Check failed.");
            return;
        }
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.v, null);
        if (g1dVar != null) {
            d(g1dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [qwe] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lf1
    public final boolean G(InputConfiguration inputConfiguration, ArrayList arrayList, qo1 qo1Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        g1d g1dVar;
        boolean z;
        boolean z2;
        wef wefVar;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        iy9 iy9VarB = b(qo1Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar2 = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar2 != null) {
            c(g1dVar2);
        }
        String str4 = this.c;
        String strI = ub3.i("CXCP#createReprocessableCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strI);
                nd1 nd1Var = this.d;
                try {
                    g1dVar = g1dVar2;
                    try {
                        nd1 nd1Var2 = this.d;
                        a90 a90Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strI;
                            z = true;
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new op(this, qo1Var, g1dVar, nd1Var2, a90Var, handlerA), r11.a());
                                wefVar = wef.a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    nd1Var.a(i, str4, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        nd1Var.a(9, str4, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    wefVar = null;
                                    r10 = z;
                                }
                                z2 = false;
                                wefVar = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strI;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strI;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", kv2.q(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strI;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strI;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strI;
                    g1dVar = g1dVar2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strI;
                    r11 = 1;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", kv2.q(str3, " - ")));
                if (wefVar == null) {
                    b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                    if (g1dVar != null) {
                        d(g1dVar);
                    }
                }
                return wefVar != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
                str = strI;
                r9 = 1;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", kv2.q(str, " - ")));
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(CameraDevice.class))) {
            return this.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f0 A[Catch: all -> 0x00be, TryCatch #9 {all -> 0x00be, blocks: (B:26:0x009a, B:28:0x00a6, B:30:0x00ac, B:32:0x00ba, B:37:0x00c4, B:38:0x00cb, B:39:0x00cc, B:51:0x00ec, B:53:0x00f0, B:62:0x011d, B:68:0x013c, B:71:0x0142, B:73:0x0146, B:75:0x014a, B:77:0x014e, B:80:0x0153, B:82:0x0157, B:83:0x015d, B:84:0x015e), top: B:99:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d A[Catch: all -> 0x00be, TryCatch #9 {all -> 0x00be, blocks: (B:26:0x009a, B:28:0x00a6, B:30:0x00ac, B:32:0x00ba, B:37:0x00c4, B:38:0x00cb, B:39:0x00cc, B:51:0x00ec, B:53:0x00f0, B:62:0x011d, B:68:0x013c, B:71:0x0142, B:73:0x0146, B:75:0x014a, B:77:0x014e, B:80:0x0153, B:82:0x0157, B:83:0x015d, B:84:0x015e), top: B:99:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0142 A[Catch: all -> 0x00be, TryCatch #9 {all -> 0x00be, blocks: (B:26:0x009a, B:28:0x00a6, B:30:0x00ac, B:32:0x00ba, B:37:0x00c4, B:38:0x00cb, B:39:0x00cc, B:51:0x00ec, B:53:0x00f0, B:62:0x011d, B:68:0x013c, B:71:0x0142, B:73:0x0146, B:75:0x014a, B:77:0x014e, B:80:0x0153, B:82:0x0157, B:83:0x015d, B:84:0x015e), top: B:99:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01be  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x011d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x019f, please report this as an issue */
    @Override // defpackage.lf1
    public final boolean L0(v85 v85Var) throws Throwable {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        wef wefVar;
        boolean z;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        ft ftVar = v85Var.b;
        String str5 = "%.3f ms";
        CameraDevice cameraDevice = this.b;
        Integer num = v85Var.f;
        w85 w85Var = v85Var.g;
        iy9 iy9VarB = b(w85Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar != null) {
            c(g1dVar);
        }
        String str6 = this.c;
        String strI = ub3.i("CXCP#createExtensionSession-", str6);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strI);
                nd1 nd1Var = this.d;
                try {
                    int iIntValue = num.intValue();
                    ArrayList arrayList = v85Var.a;
                    j = jElapsedRealtimeNanos;
                    try {
                        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        try {
                            try {
                                while (true) {
                                    str3 = str5;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    try {
                                        try {
                                            int i2 = iIntValue;
                                            arrayList2.add((OutputConfiguration) ((ot) it.next()).H0(job.a.b(OutputConfiguration.class)));
                                            str5 = str3;
                                            iIntValue = i2;
                                        } catch (Exception e) {
                                            e = e;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        str2 = " - ";
                                        str = str3;
                                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(j) / 1000000.0d)}, 1, null, str, kv2.q(strI, str2)));
                                        throw th;
                                    }
                                    e = e;
                                    str4 = " - ";
                                    if (!(e instanceof CameraAccessException)) {
                                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            z = false;
                                            nd1Var.a(9, str6, false);
                                        } else {
                                            if (!(e instanceof IllegalStateException)) {
                                                throw e;
                                            }
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        }
                                        wefVar = null;
                                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(j) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                                        if (wefVar == null) {
                                            b1.l("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                            if (g1dVar != null) {
                                                d(g1dVar);
                                            }
                                        }
                                        if (wefVar != null) {
                                            return true;
                                        }
                                        return z;
                                    }
                                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    nd1Var.a(i, str6, z2);
                                    z = false;
                                    wefVar = null;
                                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(j) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                                    if (wefVar == null) {
                                        b1.l("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                        if (g1dVar != null) {
                                            d(g1dVar);
                                        }
                                    }
                                    if (wefVar != null) {
                                        return true;
                                    }
                                    return z;
                                }
                                ExtensionSessionConfiguration extensionSessionConfiguration = new ExtensionSessionConfiguration(iIntValue, arrayList2, ftVar, new xr(this, w85Var, g1dVar, this.d, this.e, ftVar));
                                ot otVar = v85Var.h;
                                if (otVar != null && Build.VERSION.SDK_INT >= 34) {
                                    OutputConfiguration outputConfiguration = (OutputConfiguration) otVar.H0(job.a.b(OutputConfiguration.class));
                                    if (outputConfiguration == null) {
                                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                                    }
                                    hgc.V(extensionSessionConfiguration, outputConfiguration);
                                }
                                cameraDevice.createExtensionSession(extensionSessionConfiguration);
                                wefVar = wef.a;
                                z = false;
                            } catch (Exception e2) {
                                e = e2;
                                if (!(e instanceof CameraAccessException)) {
                                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    nd1Var.a(i, str6, z2);
                                } else {
                                    if (e instanceof IllegalArgumentException) {
                                    }
                                    b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    nd1Var.a(9, str6, false);
                                    wefVar = null;
                                }
                                z = false;
                                wefVar = null;
                            }
                            str4 = " - ";
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(j) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                            if (wefVar == null) {
                                b1.l("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                if (g1dVar != null) {
                                    d(g1dVar);
                                }
                            }
                            if (wefVar != null) {
                                return true;
                            }
                            return z;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = " - ";
                            str = str3;
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(j) / 1000000.0d)}, 1, null, str, kv2.q(strI, str2)));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str3 = str5;
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = str5;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = "%.3f ms";
                    j = jElapsedRealtimeNanos;
                } catch (Throwable th4) {
                    th = th4;
                    str3 = "%.3f ms";
                    j = jElapsedRealtimeNanos;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            str = "%.3f ms";
            str2 = " - ";
            j = jElapsedRealtimeNanos;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(j) / 1000000.0d)}, 1, null, str, kv2.q(strI, str2)));
            throw th;
        }
    }

    @Override // defpackage.lf1
    public final void R() {
        g1d g1dVar;
        if (!this.g.a() || (g1dVar = (g1d) this.v.a) == null) {
            return;
        }
        c(g1dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [qwe] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lf1
    public final boolean U0(ArrayList arrayList, qo1 qo1Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        g1d g1dVar;
        boolean z;
        boolean z2;
        wef wefVar;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        iy9 iy9VarB = b(qo1Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar2 = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar2 != null) {
            c(g1dVar2);
        }
        String str4 = this.c;
        String strI = ub3.i("CXCP#createConstrainedHighSpeedCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strI);
                nd1 nd1Var = this.d;
                try {
                    g1dVar = g1dVar2;
                    try {
                        nd1 nd1Var2 = this.d;
                        a90 a90Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strI;
                            z = true;
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new op(this, qo1Var, g1dVar, nd1Var2, a90Var, handlerA), r11.a());
                                wefVar = wef.a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    nd1Var.a(i, str4, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        nd1Var.a(9, str4, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    wefVar = null;
                                    r10 = z;
                                }
                                z2 = false;
                                wefVar = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strI;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strI;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", kv2.q(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strI;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strI;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strI;
                    g1dVar = g1dVar2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strI;
                    r11 = 1;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", kv2.q(str3, " - ")));
                if (wefVar == null) {
                    b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (g1dVar != null) {
                        d(g1dVar);
                    }
                }
                return wefVar != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
                str = strI;
                r9 = 1;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", kv2.q(str, " - ")));
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.ik0
    public final void a(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.c;
            nd1 nd1Var = this.d;
            try {
                p6.n(this.b, i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i2 = 3;
                    } else if (reason == 2) {
                        i2 = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i2 = 1;
                        } else if (reason != 5) {
                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i2 = 11;
                        } else {
                            i2 = 2;
                        }
                    }
                    nd1Var.a(i2, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    nd1Var.a(9, str, false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final iy9 b(g1d g1dVar) {
        if (this.g.b()) {
            d(g1dVar);
            return new iy9(Boolean.FALSE, null);
        }
        return new iy9(Boolean.TRUE, zh0.b.getAndSet(this.v, g1dVar));
    }

    public final void c(g1d g1dVar) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            g1dVar.b();
        } finally {
            Trace.endSection();
        }
    }

    public final void d(g1d g1dVar) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            g1dVar.a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0252  */
    /* JADX WARN: Code duplicated, block: B:110:0x026a  */
    /* JADX WARN: Code duplicated, block: B:112:0x026f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0271  */
    /* JADX WARN: Code duplicated, block: B:73:0x019a A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:29:0x00a8, B:31:0x00b4, B:33:0x00ba, B:38:0x00c9, B:41:0x00f4, B:42:0x0117, B:44:0x011d, B:45:0x012b, B:46:0x0135, B:48:0x013b, B:50:0x014d, B:52:0x015a, B:53:0x015e, B:55:0x0170, B:58:0x0179, B:59:0x017c, B:61:0x017e, B:62:0x0181, B:71:0x0196, B:73:0x019a, B:82:0x01c7, B:89:0x01ee, B:91:0x01f3, B:93:0x01f9, B:95:0x01fd, B:97:0x0201, B:100:0x0206, B:102:0x020a, B:103:0x0210, B:104:0x0211), top: B:119:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:29:0x00a8, B:31:0x00b4, B:33:0x00ba, B:38:0x00c9, B:41:0x00f4, B:42:0x0117, B:44:0x011d, B:45:0x012b, B:46:0x0135, B:48:0x013b, B:50:0x014d, B:52:0x015a, B:53:0x015e, B:55:0x0170, B:58:0x0179, B:59:0x017c, B:61:0x017e, B:62:0x0181, B:71:0x0196, B:73:0x019a, B:82:0x01c7, B:89:0x01ee, B:91:0x01f3, B:93:0x01f9, B:95:0x01fd, B:97:0x0201, B:100:0x0206, B:102:0x020a, B:103:0x0210, B:104:0x0211), top: B:119:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:29:0x00a8, B:31:0x00b4, B:33:0x00ba, B:38:0x00c9, B:41:0x00f4, B:42:0x0117, B:44:0x011d, B:45:0x012b, B:46:0x0135, B:48:0x013b, B:50:0x014d, B:52:0x015a, B:53:0x015e, B:55:0x0170, B:58:0x0179, B:59:0x017c, B:61:0x017e, B:62:0x0181, B:71:0x0196, B:73:0x019a, B:82:0x01c7, B:89:0x01ee, B:91:0x01f3, B:93:0x01f9, B:95:0x01fd, B:97:0x0201, B:100:0x0206, B:102:0x020a, B:103:0x0210, B:104:0x0211), top: B:119:0x003f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0252, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x019a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01c7, please report this as an issue */
    @Override // defpackage.lf1
    public final boolean g0(d0d d0dVar) throws Throwable {
        String str;
        String str2;
        String str3;
        g1d g1dVar;
        String str4;
        boolean z;
        wef wefVar;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        CameraDevice cameraDevice = this.b;
        List list = d0dVar.b;
        qo1 qo1Var = d0dVar.e;
        iy9 iy9VarB = b(qo1Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar2 = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar2 != null) {
            c(g1dVar2);
        }
        String str5 = this.c;
        String strI = ub3.i("CXCP#createCaptureSession-", str5);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strI);
                nd1 nd1Var = this.d;
                try {
                    int i2 = d0dVar.a;
                    ArrayList arrayList = d0dVar.c;
                    str3 = "%.3f ms";
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    int i3 = i2;
                                    arrayList2.add((OutputConfiguration) ((ot) it.next()).H0(job.a.b(OutputConfiguration.class)));
                                    i2 = i3;
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = " - ";
                                    str = str3;
                                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, kv2.q(strI, str2)));
                                    throw th;
                                }
                            }
                            int i4 = i2;
                            Executor executor = d0dVar.d;
                            g1dVar = g1dVar2;
                            try {
                                nd1Var = nd1Var;
                                str4 = " - ";
                                try {
                                    op opVar = new op(this, qo1Var, g1dVar, this.d, this.e, this.f.a());
                                    executor.getClass();
                                    SessionConfiguration sessionConfigurationA = m60.a(i4, arrayList2, executor, opVar);
                                    if (list != null) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            s.b0(sessionConfigurationA, xq.u(str5, list));
                                        } else {
                                            s.b0(sessionConfigurationA, new InputConfiguration(((f47) s72.X0(list)).a, ((f47) s72.X0(list)).b, ((f47) s72.X0(list)).c));
                                        }
                                    }
                                    try {
                                        Trace.beginSection("createCaptureRequest");
                                        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(d0dVar.f);
                                        Trace.endSection();
                                        builderCreateCaptureRequest.getClass();
                                        Set set = (Set) ((nc1) this.a).w.getValue();
                                        ArrayList arrayList3 = new ArrayList(t72.u(set, 10));
                                        Iterator it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(((CaptureRequest.Key) it2.next()).getName());
                                        }
                                        for (Map.Entry entry : d0dVar.g.entrySet()) {
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if ((key instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key).getName())) {
                                                vtb.v(builderCreateCaptureRequest, key, value);
                                            }
                                        }
                                        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
                                        captureRequestBuild.getClass();
                                        s.f0(sessionConfigurationA, captureRequestBuild);
                                        try {
                                            Trace.beginSection("Api28Compat.createCaptureSession");
                                            s.l(cameraDevice, sessionConfigurationA);
                                            Trace.endSection();
                                            wefVar = wef.a;
                                            z = false;
                                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                                            if (wefVar == null) {
                                                b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                                if (g1dVar != null) {
                                                    d(g1dVar);
                                                }
                                            }
                                            if (wefVar != null) {
                                                return true;
                                            }
                                            return z;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof CameraAccessException) {
                                        nd1 nd1Var2 = nd1Var;
                                        if (e instanceof IllegalArgumentException) {
                                        }
                                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z = false;
                                        nd1Var2.a(9, str5, false);
                                        wefVar = null;
                                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                                        if (wefVar == null) {
                                            b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                            if (g1dVar != null) {
                                                d(g1dVar);
                                            }
                                        }
                                        if (wefVar != null) {
                                            return true;
                                        }
                                        return z;
                                    }
                                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z2 = true;
                                    if (reason == 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z2 = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z2 = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z2 = true;
                                    }
                                    nd1Var.a(i, str5, z2);
                                    wefVar = null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str4 = " - ";
                                if (e instanceof CameraAccessException) {
                                    nd1 nd1Var3 = nd1Var;
                                    if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z = false;
                                        nd1Var3.a(9, str5, false);
                                        wefVar = null;
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                                    if (wefVar == null) {
                                        b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                        if (g1dVar != null) {
                                            d(g1dVar);
                                        }
                                    }
                                    if (wefVar != null) {
                                        return true;
                                    }
                                    return z;
                                }
                                b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                cameraAccessException = (CameraAccessException) e;
                                reason = cameraAccessException.getReason();
                                i = 3;
                                z2 = true;
                                if (reason == 1) {
                                    if (reason != 2) {
                                        i = 6;
                                    } else if (reason != 3) {
                                        z2 = true;
                                        i = 0;
                                    } else if (reason != 4) {
                                        z2 = true;
                                        i = 1;
                                    } else if (reason != 5) {
                                        b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i = 11;
                                    } else {
                                        i = 2;
                                    }
                                    z2 = true;
                                }
                                nd1Var.a(i, str5, z2);
                                wefVar = null;
                                z = false;
                                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, kv2.q(strI, str4)));
                                if (wefVar == null) {
                                    b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (g1dVar != null) {
                                        d(g1dVar);
                                    }
                                }
                                if (wefVar != null) {
                                    return true;
                                }
                                return z;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            g1dVar = g1dVar2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = " - ";
                        str = str3;
                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, kv2.q(strI, str2)));
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    g1dVar = g1dVar2;
                    str3 = "%.3f ms";
                } catch (Throwable th5) {
                    th = th5;
                    str3 = "%.3f ms";
                }
            } catch (Throwable th6) {
                th = th6;
                str = "%.3f ms";
                str2 = " - ";
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, kv2.q(strI, str2)));
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // defpackage.lf1
    public final CaptureRequest.Builder h0(int i) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            nd1 nd1Var = this.d;
            try {
                builderCreateCaptureRequest = this.b.createCaptureRequest(i);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i2 = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason == 1) {
                            i2 = 3;
                        } else if (reason == 2) {
                            i2 = 6;
                        } else if (reason != 3) {
                            if (reason == 4) {
                                i2 = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i2 = 11;
                            } else {
                                i2 = 2;
                            }
                        }
                        nd1Var.a(i2, str, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        nd1Var.a(9, str, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateCaptureRequest = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            return builderCreateCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:8:0x003e, B:9:0x0043, B:10:0x005f, B:12:0x0065, B:14:0x006f, B:36:0x00c1, B:38:0x00c5, B:47:0x00f2, B:54:0x0119, B:56:0x011e, B:58:0x0124, B:60:0x0128, B:62:0x012c, B:65:0x0131, B:67:0x0135, B:68:0x013b, B:69:0x013c, B:23:0x0092, B:25:0x009c, B:27:0x00a9), top: B:84:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2 A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:8:0x003e, B:9:0x0043, B:10:0x005f, B:12:0x0065, B:14:0x006f, B:36:0x00c1, B:38:0x00c5, B:47:0x00f2, B:54:0x0119, B:56:0x011e, B:58:0x0124, B:60:0x0128, B:62:0x012c, B:65:0x0131, B:67:0x0135, B:68:0x013b, B:69:0x013c, B:23:0x0092, B:25:0x009c, B:27:0x00a9), top: B:84:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:8:0x003e, B:9:0x0043, B:10:0x005f, B:12:0x0065, B:14:0x006f, B:36:0x00c1, B:38:0x00c5, B:47:0x00f2, B:54:0x0119, B:56:0x011e, B:58:0x0124, B:60:0x0128, B:62:0x012c, B:65:0x0131, B:67:0x0135, B:68:0x013b, B:69:0x013c, B:23:0x0092, B:25:0x009c, B:27:0x00a9), top: B:84:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0124 A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:8:0x003e, B:9:0x0043, B:10:0x005f, B:12:0x0065, B:14:0x006f, B:36:0x00c1, B:38:0x00c5, B:47:0x00f2, B:54:0x0119, B:56:0x011e, B:58:0x0124, B:60:0x0128, B:62:0x012c, B:65:0x0131, B:67:0x0135, B:68:0x013b, B:69:0x013c, B:23:0x0092, B:25:0x009c, B:27:0x00a9), top: B:84:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0196 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0198  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00f2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0179, please report this as an issue */
    @Override // defpackage.lf1
    public final boolean l(f47 f47Var, ArrayList arrayList, qo1 qo1Var) {
        nd1 nd1Var;
        boolean z;
        wef wefVar;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        g1d g1dVar;
        qwe qweVar = this.f;
        CameraDevice cameraDevice = this.b;
        iy9 iy9VarB = b(qo1Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar2 = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar2 != null) {
            c(g1dVar2);
        }
        String str = this.c;
        String strI = ub3.i("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strI);
            nd1 nd1Var2 = this.d;
            try {
                InputConfiguration inputConfiguration = new InputConfiguration(f47Var.a, f47Var.b, f47Var.c);
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        g1dVar = g1dVar2;
                        try {
                            arrayList2.add((OutputConfiguration) ((ot) it.next()).H0(job.a.b(OutputConfiguration.class)));
                            g1dVar2 = g1dVar;
                        } catch (Exception e) {
                            e = e;
                            nd1Var = nd1Var2;
                            g1dVar2 = g1dVar;
                            if (e instanceof CameraAccessException) {
                                nd1 nd1Var3 = nd1Var;
                                if (e instanceof IllegalArgumentException) {
                                }
                                b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                nd1Var3.a(9, str, false);
                                wefVar = null;
                                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                                if (wefVar == null) {
                                    b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                    if (g1dVar2 != null) {
                                        d(g1dVar2);
                                    }
                                }
                                if (wefVar != null) {
                                    return true;
                                }
                                return z;
                            }
                            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z2 = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z2 = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z2 = true;
                            }
                            nd1Var.a(i, str, z2);
                            wefVar = null;
                            z = false;
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                            if (wefVar == null) {
                                b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (g1dVar2 != null) {
                                    d(g1dVar2);
                                }
                            }
                            if (wefVar != null) {
                                return true;
                            }
                            return z;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        nd1Var = nd1Var2;
                        if (e instanceof CameraAccessException) {
                            nd1 nd1Var4 = nd1Var;
                            if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                z = false;
                                nd1Var4.a(9, str, false);
                                wefVar = null;
                            } else {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                            if (wefVar == null) {
                                b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (g1dVar2 != null) {
                                    d(g1dVar2);
                                }
                            }
                            if (wefVar != null) {
                                return true;
                            }
                            return z;
                        }
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z2 = true;
                        if (reason == 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z2 = true;
                                i = 0;
                            } else if (reason != 4) {
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        }
                        nd1Var.a(i, str, z2);
                        wefVar = null;
                        z = false;
                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                        if (wefVar == null) {
                            b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                            if (g1dVar2 != null) {
                                d(g1dVar2);
                            }
                        }
                        if (wefVar != null) {
                            return true;
                        }
                        return z;
                    }
                }
                g1dVar = g1dVar2;
                try {
                    nd1Var = nd1Var2;
                    g1dVar2 = g1dVar;
                    try {
                        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new op(this, qo1Var, g1dVar2, this.d, this.e, qweVar.a()), qweVar.a());
                        wefVar = wef.a;
                    } catch (Exception e3) {
                        e = e3;
                        if (e instanceof CameraAccessException) {
                            nd1 nd1Var5 = nd1Var;
                            if (e instanceof IllegalArgumentException) {
                            }
                            b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z = false;
                            nd1Var5.a(9, str, false);
                            wefVar = null;
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                            if (wefVar == null) {
                                b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (g1dVar2 != null) {
                                    d(g1dVar2);
                                }
                            }
                            if (wefVar != null) {
                                return true;
                            }
                            return z;
                        }
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z2 = true;
                        if (reason == 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z2 = true;
                                i = 0;
                            } else if (reason != 4) {
                                z2 = true;
                                i = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z2 = true;
                        }
                        nd1Var.a(i, str, z2);
                        wefVar = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    nd1Var = nd1Var2;
                    g1dVar2 = g1dVar;
                    if (e instanceof CameraAccessException) {
                        nd1 nd1Var6 = nd1Var;
                        if (e instanceof IllegalArgumentException) {
                        }
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        z = false;
                        nd1Var6.a(9, str, false);
                        wefVar = null;
                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                        if (wefVar == null) {
                            b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                            if (g1dVar2 != null) {
                                d(g1dVar2);
                            }
                        }
                        if (wefVar != null) {
                            return true;
                        }
                        return z;
                    }
                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z2 = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z2 = true;
                            i = 0;
                        } else if (reason != 4) {
                            z2 = true;
                            i = 1;
                        } else if (reason != 5) {
                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z2 = true;
                    }
                    nd1Var.a(i, str, z2);
                    wefVar = null;
                    z = false;
                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                    if (wefVar == null) {
                        b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                        if (g1dVar2 != null) {
                            d(g1dVar2);
                        }
                    }
                    if (wefVar != null) {
                        return true;
                    }
                    return z;
                }
            } catch (Exception e5) {
                e = e5;
            }
            z = false;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
            if (wefVar == null) {
                b1.l("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (g1dVar2 != null) {
                    d(g1dVar2);
                }
            }
            if (wefVar != null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [qwe] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lf1
    public final boolean p0(List list, qe1 qe1Var) throws Throwable {
        String str;
        ?? r9;
        String str2;
        String str3;
        g1d g1dVar;
        boolean z;
        boolean z2;
        wef wefVar;
        ?? r10;
        ?? r11 = this.f;
        CameraDevice cameraDevice = this.b;
        iy9 iy9VarB = b(qe1Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar2 = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar2 != null) {
            c(g1dVar2);
        }
        String str4 = this.c;
        String strI = ub3.i("CXCP#createCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strI);
                nd1 nd1Var = this.d;
                try {
                    g1dVar = g1dVar2;
                    try {
                        nd1 nd1Var2 = this.d;
                        a90 a90Var = this.e;
                        try {
                            Handler handlerA = r11.a();
                            str3 = strI;
                            z = true;
                            try {
                                cameraDevice.createCaptureSession(list, new op(this, qe1Var, g1dVar, nd1Var2, a90Var, handlerA), r11.a());
                                wefVar = wef.a;
                                z2 = false;
                                r10 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i = 6;
                                        } else if (reason == 3) {
                                            i = 0;
                                        } else if (reason == 4) {
                                            i = z ? 1 : 0;
                                        } else if (reason != 5) {
                                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                    nd1Var.a(i, str4, z);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        z2 = false;
                                        nd1Var.a(9, str4, false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    wefVar = null;
                                    r10 = z;
                                }
                                z2 = false;
                                wefVar = null;
                                r10 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strI;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strI;
                            r11 = 1;
                            str = str2;
                            r9 = r11;
                            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", kv2.q(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strI;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = 1;
                        str2 = strI;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strI;
                    g1dVar = g1dVar2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strI;
                    r11 = 1;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r10, null, "%.3f ms", kv2.q(str3, " - ")));
                if (wefVar == null) {
                    b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (g1dVar != null) {
                        d(g1dVar);
                    }
                }
                return wefVar != null ? r10 : z2;
            } catch (Throwable th4) {
                th = th4;
                str = strI;
                r9 = 1;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", kv2.q(str, " - ")));
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) ig1.b(this.c)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[Catch: all -> 0x0074, TryCatch #2 {all -> 0x0074, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x0053, B:12:0x0059, B:18:0x007c, B:20:0x0080, B:22:0x0085, B:24:0x008e, B:32:0x00a5, B:34:0x00a9, B:43:0x00d6, B:50:0x00fd, B:52:0x0102, B:54:0x0108, B:56:0x010c, B:58:0x0110, B:61:0x0115, B:63:0x0119, B:64:0x011f, B:65:0x0120), top: B:82:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[Catch: all -> 0x0074, TryCatch #2 {all -> 0x0074, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x0053, B:12:0x0059, B:18:0x007c, B:20:0x0080, B:22:0x0085, B:24:0x008e, B:32:0x00a5, B:34:0x00a9, B:43:0x00d6, B:50:0x00fd, B:52:0x0102, B:54:0x0108, B:56:0x010c, B:58:0x0110, B:61:0x0115, B:63:0x0119, B:64:0x011f, B:65:0x0120), top: B:82:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[Catch: all -> 0x0074, TryCatch #2 {all -> 0x0074, blocks: (B:8:0x003d, B:9:0x0042, B:10:0x0053, B:12:0x0059, B:18:0x007c, B:20:0x0080, B:22:0x0085, B:24:0x008e, B:32:0x00a5, B:34:0x00a9, B:43:0x00d6, B:50:0x00fd, B:52:0x0102, B:54:0x0108, B:56:0x010c, B:58:0x0110, B:61:0x0115, B:63:0x0119, B:64:0x011f, B:65:0x0120), top: B:82:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00d6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x015d, please report this as an issue */
    @Override // defpackage.lf1
    public final boolean u(ArrayList arrayList, qo1 qo1Var) {
        g1d g1dVar;
        nd1 nd1Var;
        boolean z;
        wef wefVar;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z2;
        qwe qweVar = this.f;
        CameraDevice cameraDevice = this.b;
        iy9 iy9VarB = b(qo1Var);
        boolean zBooleanValue = ((Boolean) iy9VarB.a()).booleanValue();
        g1d g1dVar2 = (g1d) iy9VarB.b();
        if (!zBooleanValue) {
            return false;
        }
        if (g1dVar2 != null) {
            c(g1dVar2);
        }
        String str = this.c;
        String strI = ub3.i("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strI);
            nd1 nd1Var2 = this.d;
            try {
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((OutputConfiguration) ((ot) it.next()).H0(job.a.b(OutputConfiguration.class)));
                }
                g1dVar = g1dVar2;
                try {
                    try {
                        nd1Var = nd1Var2;
                        try {
                            cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new op(this, qo1Var, g1dVar, this.d, this.e, qweVar.a()), qweVar.a());
                            wefVar = wef.a;
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CameraAccessException) {
                                nd1 nd1Var3 = nd1Var;
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    nd1Var3.a(9, str, false);
                                    wefVar = null;
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                                if (wefVar == null) {
                                    b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (g1dVar != null) {
                                        d(g1dVar);
                                    }
                                }
                                if (wefVar != null) {
                                    return true;
                                }
                                return z;
                            }
                            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z2 = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z2 = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z2 = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z2 = true;
                            }
                            nd1Var.a(i, str, z2);
                            wefVar = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        nd1Var = nd1Var2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    nd1Var = nd1Var2;
                    if (e instanceof CameraAccessException) {
                        nd1 nd1Var4 = nd1Var;
                        if (e instanceof IllegalArgumentException) {
                        }
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        z = false;
                        nd1Var4.a(9, str, false);
                        wefVar = null;
                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                        if (wefVar == null) {
                            b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                            if (g1dVar != null) {
                                d(g1dVar);
                            }
                        }
                        if (wefVar != null) {
                            return true;
                        }
                        return z;
                    }
                    b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z2 = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z2 = true;
                            i = 0;
                        } else if (reason != 4) {
                            z2 = true;
                            i = 1;
                        } else if (reason != 5) {
                            b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z2 = true;
                    }
                    nd1Var.a(i, str, z2);
                    wefVar = null;
                    z = false;
                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
                    if (wefVar == null) {
                        b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                        if (g1dVar != null) {
                            d(g1dVar);
                        }
                    }
                    if (wefVar != null) {
                        return true;
                    }
                    return z;
                }
            } catch (Exception e4) {
                e = e4;
                g1dVar = g1dVar2;
            }
            z = false;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
            if (wefVar == null) {
                b1.l("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (g1dVar != null) {
                    d(g1dVar);
                }
            }
            if (wefVar != null) {
                return true;
            }
            return z;
        } catch (Throwable th) {
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(strI, " - ")));
            throw th;
        }
    }

    @Override // defpackage.lf1
    public final String x() {
        return this.c;
    }
}
