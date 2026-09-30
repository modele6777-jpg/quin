package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xfb {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap.KeySetView b = ConcurrentHashMap.newKeySet();

    public static wef a(String str) {
        str.getClass();
        vfb vfbVar = (vfb) a.get(str);
        if (vfbVar == null) {
            return null;
        }
        synchronized (vfbVar) {
            vfbVar.i++;
        }
        return wef.a;
    }

    public static void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        vfb vfbVar = (vfb) a.get(str);
        if (vfbVar != null) {
            synchronized (vfbVar) {
                vfbVar.g = str2;
            }
        }
    }

    public static void c(String str, String str2) {
        str.getClass();
        vfb vfbVar = (vfb) a.get(str);
        if (vfbVar != null) {
            synchronized (vfbVar) {
                if (vfbVar.g.length() == 0) {
                    vfbVar.g = str2;
                }
            }
        }
    }

    public static wef d(String str) {
        str.getClass();
        vfb vfbVar = (vfb) a.get(str);
        if (vfbVar == null) {
            return null;
        }
        synchronized (vfbVar) {
            vfbVar.j++;
        }
        return wef.a;
    }

    public static boolean e(int i, String str, String str2) {
        boolean z;
        wfb wfbVar;
        str.getClass();
        vfb vfbVar = (vfb) a.remove(str);
        if (vfbVar == null) {
            return false;
        }
        synchronized (vfbVar) {
            try {
                z = true;
                if (vfbVar.m) {
                    wfbVar = null;
                    z = true;
                } else {
                    vfbVar.m = true;
                    wfbVar = new wfb(vfbVar.a, vfbVar.b, vfbVar.c, vfbVar.d, vfbVar.e, vfbVar.f, vfbVar.g, vfbVar.h, vfbVar.i, vfbVar.j, vfbVar.k, str2 == null ? vfbVar.l : str2, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wfbVar == null) {
            return false;
        }
        String str3 = wfbVar.a;
        String str4 = wfbVar.b;
        String str5 = wfbVar.c;
        boolean z2 = wfbVar.d;
        boolean z3 = wfbVar.e;
        jhb jhbVar = wfbVar.f;
        String str6 = wfbVar.g;
        int i2 = wfbVar.h;
        int i3 = wfbVar.i;
        int i4 = wfbVar.j;
        boolean z4 = wfbVar.k;
        String str7 = wfbVar.l;
        str3.getClass();
        str6.getClass();
        str7.getClass();
        wfb wfbVar2 = new wfb(str3, str4, str5, z2, z3, jhbVar, str6, i2, i3, i4, z4, str7, i);
        if (pa7.t(str2, "reading_done")) {
            ConcurrentHashMap.KeySetView keySetView = b;
            keySetView.getClass();
            keySetView.add(str);
        }
        x1f x1fVar = x1f.a;
        x1f.g(new r05("reading_interaction_summary"), m1f.c, new p59(24, wfbVar2));
        return z;
    }

    public static wef g(String str) {
        str.getClass();
        vfb vfbVar = (vfb) a.get(str);
        if (vfbVar == null) {
            return null;
        }
        synchronized (vfbVar) {
            vfbVar.h++;
        }
        return wef.a;
    }

    public static wef h(String str, jhb jhbVar) {
        str.getClass();
        vfb vfbVar = (vfb) a.get(str);
        String str2 = null;
        if (vfbVar == null) {
            return null;
        }
        synchronized (vfbVar) {
            try {
                Boolean bool = jhbVar.b;
                if (bool == null) {
                    jhb jhbVar2 = vfbVar.f;
                    bool = jhbVar2 != null ? jhbVar2.b : null;
                }
                String str3 = jhbVar.c;
                if (str3 == null) {
                    jhb jhbVar3 = vfbVar.f;
                    str3 = jhbVar3 != null ? jhbVar3.c : null;
                }
                String str4 = jhbVar.d;
                if (str4 == null) {
                    jhb jhbVar4 = vfbVar.f;
                    if (jhbVar4 != null) {
                        str2 = jhbVar4.d;
                    }
                } else {
                    str2 = str4;
                }
                String str5 = jhbVar.a;
                str5.getClass();
                vfbVar.f = new jhb(str5, bool, str3, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return wef.a;
    }

    public static wef i(String str, String str2) {
        str.getClass();
        vfb vfbVar = (vfb) a.get(str);
        if (vfbVar == null) {
            return null;
        }
        synchronized (vfbVar) {
            vfbVar.l = str2;
        }
        return wef.a;
    }
}
