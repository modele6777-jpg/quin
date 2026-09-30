package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rk1 b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ la1 g;

    public /* synthetic */ qk1(rk1 rk1Var, Context context, Executor executor, int i, la1 la1Var, long j) {
        this.b = rk1Var;
        this.f = context;
        this.c = executor;
        this.e = i;
        this.g = la1Var;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d0 A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x021a A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x021e A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0222 A[Catch: all -> 0x0235, TryCatch #3 {all -> 0x0235, blocks: (B:7:0x0034, B:9:0x003c, B:11:0x0061, B:13:0x007c, B:15:0x008a, B:17:0x00ab, B:24:0x00bd, B:25:0x00e6, B:27:0x00ec, B:28:0x00fc, B:30:0x012e, B:31:0x0131, B:32:0x0133, B:36:0x0138, B:40:0x0142, B:41:0x0143, B:42:0x014f, B:53:0x0173, B:57:0x018a, B:59:0x01c2, B:85:0x022a, B:60:0x01c6, B:61:0x01d0, B:62:0x01d3, B:66:0x01d8, B:68:0x01dc, B:69:0x01de, B:73:0x01e3, B:77:0x01ea, B:78:0x01eb, B:80:0x01ef, B:81:0x021a, B:83:0x021e, B:84:0x0222, B:90:0x0234, B:49:0x0157, B:50:0x0164, B:51:0x0165, B:52:0x0172, B:64:0x01d5, B:65:0x01d7, B:71:0x01e0, B:72:0x01e2), top: B:98:0x0034, inners: #2, #5 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x01ef, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        szb szbVarB;
        switch (this.a) {
            case 0:
                rk1 rk1Var = this.b;
                Context context = this.f;
                Executor executor = this.c;
                int i = this.e;
                la1 la1Var = this.g;
                long j = this.d;
                Trace.beginSection(xdc.v("CX:initAndRetryRecursively"));
                try {
                    try {
                        tf1 tf1VarJ = rk1Var.c.j();
                        try {
                            if (tf1VarJ == null) {
                                throw new a37(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                            }
                            jo0 jo0Var = new jo0(rk1Var.d, rk1Var.e);
                            xi1 xi1VarD = rk1Var.c.d();
                            context.getClass();
                            pk1 pk1Var = new pk1(context, xi1VarD);
                            long jM = rk1Var.c.m();
                            if (rk1Var.c.p() == null) {
                                throw new a37(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                            }
                            mk1 mk1Var = new mk1(context);
                            rk1Var.i = mk1Var;
                            vea veaVar = new vea(mk1Var);
                            rk1Var.j = veaVar;
                            rk1Var.g = tf1VarJ.a(context, jo0Var, xi1VarD, jM, rk1Var.c, veaVar);
                            if (rk1Var.c.n() == null) {
                                throw new a37(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
                            zj1 zj1Var = new zj1(context, (n23) ((ace) rk1Var.g.v).getValue(), rk1Var.g.g());
                            rk1Var.h = zj1Var;
                            rk1Var.j.c = zj1Var;
                            if (executor instanceof qf1) {
                                ((qf1) executor).b(rk1Var.g);
                            }
                            rk1Var.a.d(rk1Var.g);
                            if1 if1Var = (if1) rk1Var.g.f;
                            if1Var.b(rk1Var.a);
                            rk1Var.k = new szc(rk1Var.a, if1Var, rk1Var.i, rk1Var.j);
                            Iterator it = rk1Var.a.c().iterator();
                            while (it.hasNext()) {
                                ((pg1) it.next()).q().j(rk1Var.k);
                            }
                            rk1Var.n.g(pk1Var, rk1Var.g, rk1Var.a);
                            uh1 uh1Var = rk1Var.n;
                            zj1 zj1Var2 = rk1Var.h;
                            uh1Var.getClass();
                            zj1Var2.getClass();
                            uh1Var.m.add(zj1Var2);
                            uh1 uh1Var2 = rk1Var.n;
                            if1 if1Var2 = (if1) rk1Var.g.f;
                            uh1Var2.getClass();
                            if1Var2.getClass();
                            uh1Var2.m.add(if1Var2);
                            pk1Var.p(rk1Var.a);
                            if (i > 1) {
                                rk1.b(null);
                            }
                            synchronized (rk1Var.b) {
                                rk1Var.p = 4;
                                break;
                            }
                            la1Var.b(null);
                            Trace.endSection();
                            return;
                        } catch (a37 e) {
                            e = e;
                            ri1 ri1Var = new ri1(j, e);
                            szbVarB = rk1Var.l.b(ri1Var);
                            rk1.b(ri1Var);
                            if (szbVarB.b) {
                                synchronized (rk1Var.b) {
                                    rk1Var.p = 3;
                                    if (szbVarB.c) {
                                        synchronized (rk1Var.b) {
                                            rk1Var.p = 4;
                                            la1Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof nk1) {
                                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                                            b21.w("CameraX", str, e);
                                            la1Var.d(new a37(new ck1(str)));
                                        } else if (e instanceof a37) {
                                            la1Var.d(e);
                                        } else {
                                            la1Var.d(new a37(e));
                                        }
                                        rk1Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (rk1Var.b) {
                                    rk1Var.p = 3;
                                    if (szbVarB.c) {
                                        synchronized (rk1Var.b) {
                                            rk1Var.p = 4;
                                            la1Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof nk1) {
                                            String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                                            b21.w("CameraX", str2, e);
                                            la1Var.d(new a37(new ck1(str2)));
                                        } else if (e instanceof a37) {
                                            la1Var.d(e);
                                        } else {
                                            la1Var.d(new a37(e));
                                        }
                                        rk1Var.n.f();
                                    }
                                }
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            ri1 ri1Var2 = new ri1(j, e);
                            szbVarB = rk1Var.l.b(ri1Var2);
                            rk1.b(ri1Var2);
                            if (szbVarB.b) {
                                synchronized (rk1Var.b) {
                                    rk1Var.p = 3;
                                    if (szbVarB.c) {
                                        synchronized (rk1Var.b) {
                                            rk1Var.p = 4;
                                            la1Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof nk1) {
                                            String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                                            b21.w("CameraX", str3, e);
                                            la1Var.d(new a37(new ck1(str3)));
                                        } else if (e instanceof a37) {
                                            la1Var.d(e);
                                        } else {
                                            la1Var.d(new a37(e));
                                        }
                                        rk1Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (rk1Var.b) {
                                    rk1Var.p = 3;
                                    if (szbVarB.c) {
                                        synchronized (rk1Var.b) {
                                            rk1Var.p = 4;
                                            la1Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof nk1) {
                                            String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                                            b21.w("CameraX", str4, e);
                                            la1Var.d(new a37(new ck1(str4)));
                                        } else if (e instanceof a37) {
                                            la1Var.d(e);
                                        } else {
                                            la1Var.d(new a37(e));
                                        }
                                        rk1Var.n.f();
                                    }
                                }
                            }
                        } catch (nk1 e3) {
                            e = e3;
                            ri1 ri1Var3 = new ri1(j, e);
                            szbVarB = rk1Var.l.b(ri1Var3);
                            rk1.b(ri1Var3);
                            if (szbVarB.b) {
                                synchronized (rk1Var.b) {
                                    rk1Var.p = 3;
                                    if (szbVarB.c) {
                                        synchronized (rk1Var.b) {
                                            rk1Var.p = 4;
                                            la1Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof nk1) {
                                            String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                                            b21.w("CameraX", str5, e);
                                            la1Var.d(new a37(new ck1(str5)));
                                        } else if (e instanceof a37) {
                                            la1Var.d(e);
                                        } else {
                                            la1Var.d(new a37(e));
                                        }
                                        rk1Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (rk1Var.b) {
                                    rk1Var.p = 3;
                                    if (szbVarB.c) {
                                        synchronized (rk1Var.b) {
                                            rk1Var.p = 4;
                                            la1Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof nk1) {
                                            String str6 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                                            b21.w("CameraX", str6, e);
                                            la1Var.d(new a37(new ck1(str6)));
                                        } else if (e instanceof a37) {
                                            la1Var.d(e);
                                        } else {
                                            la1Var.d(new a37(e));
                                        }
                                        rk1Var.n.f();
                                    }
                                }
                            }
                        }
                    } catch (a37 e4) {
                        e = e4;
                    } catch (RuntimeException e5) {
                        e = e5;
                    } catch (nk1 e6) {
                        e = e6;
                    }
                    if (szbVarB.b || i >= Integer.MAX_VALUE) {
                        synchronized (rk1Var.b) {
                            rk1Var.p = 3;
                            break;
                        }
                        if (szbVarB.c) {
                            synchronized (rk1Var.b) {
                                rk1Var.p = 4;
                                break;
                            }
                            la1Var.b(null);
                        } else if (e instanceof nk1) {
                            String str7 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((nk1) e).getAvailableCameraCount();
                            b21.w("CameraX", str7, e);
                            la1Var.d(new a37(new ck1(str7)));
                        } else if (e instanceof a37) {
                            la1Var.d(e);
                        } else {
                            la1Var.d(new a37(e));
                        }
                        Trace.endSection();
                        return;
                    }
                    b21.X("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                    Handler handler = rk1Var.e;
                    qk1 qk1Var = new qk1(rk1Var, executor, j, i, context, la1Var);
                    long j2 = szbVarB.a;
                    if (Build.VERSION.SDK_INT >= 28) {
                        s.T(handler, qk1Var, j2);
                    } else {
                        Message messageObtain = Message.obtain(handler, qk1Var);
                        messageObtain.obj = "retry_token";
                        handler.sendMessageDelayed(messageObtain, j2);
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                ri1 ri1Var4 = new ri1(j, e);
                szbVarB = rk1Var.l.b(ri1Var4);
                rk1.b(ri1Var4);
                rk1Var.n.f();
            default:
                rk1 rk1Var2 = this.b;
                Executor executor2 = this.c;
                executor2.execute(new qk1(rk1Var2, this.f, executor2, this.e + 1, this.g, this.d));
                return;
        }
    }

    public /* synthetic */ qk1(rk1 rk1Var, Executor executor, long j, int i, Context context, la1 la1Var) {
        this.b = rk1Var;
        this.c = executor;
        this.d = j;
        this.e = i;
        this.f = context;
        this.g = la1Var;
    }
}
