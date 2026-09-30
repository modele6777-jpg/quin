package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gd1 {
    public final h1b a;
    public final qwe b;
    public final nd1 c;
    public final h1b d;
    public final qn2 e;
    public final Object f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final int j;
    public final uhb k;
    public final ace l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public gd1(h1b h1bVar, qwe qweVar, Context context, PackageManager packageManager, nd1 nd1Var, h1b h1bVar2, nh1 nh1Var, dg7 dg7Var) {
        h1bVar.getClass();
        qweVar.getClass();
        packageManager.getClass();
        nd1Var.getClass();
        h1bVar2.getClass();
        nh1Var.getClass();
        dg7Var.getClass();
        this.a = h1bVar;
        this.b = qweVar;
        this.c = nd1Var;
        this.d = h1bVar2;
        qn2 qn2VarK = jgb.k(i7h.I(new t8e(dg7Var), qweVar.h).p0(new wv2("Camera2DeviceCache")));
        this.e = qn2VarK;
        this.f = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        this.j = i;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i);
        nh1Var.a(kh1.b, new j1(12, this));
        wj5 wj5VarI = dj6.I(nk8.m(new bd1(this, null)));
        xzd xzdVar = new xzd(0L, Long.MAX_VALUE);
        veh vehVarR = if9.r(wj5VarI);
        ncd ncdVarA = ocd.a(1, vehVarR.b, (i41) vehVarR.d);
        this.k = new uhb(ncdVarA, ynb.U(qn2VarK, (pv2) vehVarR.e, xzdVar.equals(med.a) ? dw2.a : dw2.d, new nm5(xzdVar, (wj5) vehVarR.c, ncdVarA, ocd.a, null)));
        this.l = new ace(new p(16, this));
    }

    public static void e(awa awaVar, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (rxg.b0(awaVar, arrayList) instanceof qw1) {
            b1.d("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zn2 zn2Var) {
        cd1 cd1Var;
        nu3 nu3Var;
        if (zn2Var instanceof cd1) {
            cd1Var = (cd1) zn2Var;
            int i = cd1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd1Var.label = i - Integer.MIN_VALUE;
            } else {
                cd1Var = new cd1(this, zn2Var);
            }
        } else {
            cd1Var = new cd1(this, zn2Var);
        }
        Object objH0 = cd1Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = cd1Var.label;
        if (i2 == 0) {
            jzb.q(objH0);
            if (Build.VERSION.SDK_INT < 35) {
                return null;
            }
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.h;
                    ig1 ig1Var = new ig1(str);
                    Object objY = linkedHashMap.get(ig1Var);
                    if (objY == null) {
                        objY = ynb.y(this.e, this.b.f, new dd1(str, this, null), 2);
                        linkedHashMap.put(ig1Var, objY);
                    }
                    nu3Var = (nu3) objY;
                } catch (Throwable th) {
                    throw th;
                }
            }
            cd1Var.L$0 = str;
            cd1Var.L$1 = nu3Var;
            cd1Var.label = 1;
            objH0 = nu3Var.H0(cd1Var);
            if (objH0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nu3 nu3Var2 = (nu3) cd1Var.L$1;
            String str2 = (String) cd1Var.L$0;
            jzb.q(objH0);
            nu3Var = nu3Var2;
            str = str2;
        }
        jf1 jf1Var = (jf1) objH0;
        if (jf1Var != null) {
            return jf1Var;
        }
        Log.d("CXCP", "Removing null CameraDeviceSetupCompat from cache for " + ((Object) ig1.b(str)));
        synchronized (this.f) {
            this.h.remove(new ig1(str), nu3Var);
        }
        return jf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zn2 zn2Var) {
        ed1 ed1Var;
        nu3 nu3Var;
        if (zn2Var instanceof ed1) {
            ed1Var = (ed1) zn2Var;
            int i = ed1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed1Var.label = i - Integer.MIN_VALUE;
            } else {
                ed1Var = new ed1(this, zn2Var);
            }
        } else {
            ed1Var = new ed1(this, zn2Var);
        }
        Object objH0 = ed1Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = ed1Var.label;
        if (i2 == 0) {
            jzb.q(objH0);
            synchronized (this.f) {
                try {
                    LinkedHashMap linkedHashMap = this.i;
                    ig1 ig1Var = new ig1(str);
                    Object objY = linkedHashMap.get(ig1Var);
                    if (objY == null) {
                        objY = ynb.y(this.e, this.b.f, new fd1(str, this, null), 2);
                        linkedHashMap.put(ig1Var, objY);
                    }
                    nu3Var = (nu3) objY;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ed1Var.L$0 = str;
            ed1Var.L$1 = nu3Var;
            ed1Var.label = 1;
            objH0 = nu3Var.H0(ed1Var);
            if (objH0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nu3 nu3Var2 = (nu3) ed1Var.L$1;
            String str2 = (String) ed1Var.L$0;
            jzb.q(objH0);
            nu3Var = nu3Var2;
            str = str2;
        }
        md1 md1Var = (md1) objH0;
        if (md1Var != null) {
            return md1Var;
        }
        Log.d("CXCP", "Removing null camera2DeviceSetupWrapper from cache for " + ((Object) ig1.b(str)));
        synchronized (this.f) {
            this.i.remove(new ig1(str), nu3Var);
        }
        return md1Var;
    }

    public final void c(awa awaVar, String str, boolean z) {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = this.g;
        }
        ArrayList arrayListD = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        Log.i("CXCP", "New camera " + str + " detected");
                        arrayListD = d();
                        break;
                    }
                } while (!pa7.t(((ig1) it.next()).a, str));
            } else {
                Log.i("CXCP", "New camera " + str + " detected");
                arrayListD = d();
                break;
            }
        } else {
            if (z) {
                ap.c();
                return;
            }
            if (arrayList == null) {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayListD = d();
                break;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (pa7.t(((ig1) it2.next()).a, str)) {
                        Log.i("CXCP", "Unavailable camera " + str + " detected");
                        arrayListD = d();
                        break;
                    }
                }
            }
        }
        if (arrayListD != null && (arrayListD.size() >= this.j || arrayList == null)) {
            arrayList = arrayListD;
        }
        if (arrayList != null) {
            e(awaVar, arrayList);
        }
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.a.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                ig1.a(str);
                arrayList.add(new ig1(str));
            }
            if (arrayList.size() < this.j) {
                b1.l("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.f) {
                this.g = arrayList;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e) {
            b1.n("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            b1.n("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            b1.n("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }
}
