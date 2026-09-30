package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseArray;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.b1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gsg implements r36, ypb, xm9, wdh {
    public Object a;
    public Object b;

    public gsg(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                b1.l("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.b = new cwg(iBinder);
            this.a = null;
        }
    }

    @Override // defpackage.r36
    public void a(Object obj) {
        c8h c8hVar = (c8h) this.b;
        c8hVar.A0();
        w3h w3hVar = (w3h) c8hVar.b;
        c2h c2hVar = w3hVar.e;
        w3h.f(c2hVar);
        SparseArray sparseArrayG0 = c2hVar.G0();
        kbh kbhVar = (kbh) this.a;
        sparseArrayG0.put(kbhVar.c, Long.valueOf(kbhVar.b));
        c2h c2hVar2 = w3hVar.e;
        w3h.f(c2hVar2);
        int[] iArr = new int[sparseArrayG0.size()];
        long[] jArr = new long[sparseArrayG0.size()];
        for (int i = 0; i < sparseArrayG0.size(); i++) {
            iArr[i] = sparseArrayG0.keyAt(i);
            jArr[i] = ((Long) sparseArrayG0.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c2hVar2.Z.q(bundle);
        c8hVar.x = false;
        c8hVar.y = 1;
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Y.b(kbhVar.a, "Successfully registered trigger URI");
        c8hVar.Z0();
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        int i = w6h.l;
        i6h i6hVar = new i6h((gle) obj2);
        d7h d7hVar = (d7h) ((g7h) obj).l();
        String[] strArr = (String[]) this.b;
        String str = (String) this.a;
        Parcel parcelJ = d7hVar.J();
        lsg.c(parcelJ, i6hVar);
        parcelJ.writeString(str);
        parcelJ.writeInt(0);
        parcelJ.writeStringArray(strArr);
        parcelJ.writeByteArray(null);
        d7hVar.K(parcelJ, 1);
    }

    public void b(kxa kxaVar, psd psdVar) {
        n7h n7hVar = new n7h(psdVar);
        TreeMap treeMap = (TreeMap) this.a;
        for (Integer num : treeMap.keySet()) {
            zjg zjgVarClone = ((zjg) psdVar.c).clone();
            vqg vqgVarB = ((uqg) treeMap.get(num)).b(kxaVar, Collections.singletonList(n7hVar));
            int iS = vqgVarB instanceof vog ? jcc.s(((vog) vqgVarB).a.doubleValue()) : -1;
            if (iS == 2 || iS == -1) {
                psdVar.c = zjgVarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            vqg vqgVarB2 = ((uqg) treeMap2.get((Integer) it.next())).b(kxaVar, Collections.singletonList(n7hVar));
            if (vqgVarB2 instanceof vog) {
                jcc.s(((vog) vqgVarB2).a.doubleValue());
            }
        }
    }

    @Override // defpackage.wdh
    public Object c(vdh vdhVar) throws IOException {
        Uri uri = vdhVar.d;
        AtomicLong atomicLong = neh.a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = neh.a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 15 + String.valueOf(id).length() + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        oeh oehVar = vdhVar.a;
        OutputStream outputStreamB = oehVar.b(uriBuild);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamB);
        ArrayList arrayList2 = vdhVar.c;
        if (!arrayList2.isEmpty()) {
            int i = udh.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
            udh udhVar = !arrayList3.isEmpty() ? new udh(outputStreamB, arrayList3) : null;
            if (udhVar != null) {
                arrayList.add(udhVar);
            }
        }
        Iterator it2 = vdhVar.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
        } else {
            if (it2.next() == null) {
                throw null;
            }
            r3.f();
            arrayList = null;
        }
        m7h[] m7hVarArr = (m7h[]) this.b;
        if (m7hVarArr != null) {
            m7h m7hVar = m7hVarArr[0];
            m7hVar.getClass();
            OutputStream outputStream = (OutputStream) abg.B(arrayList);
            if (outputStream instanceof jeh) {
                m7hVar.b = (jeh) outputStream;
                m7hVar.a = (OutputStream) arrayList.get(0);
            }
        }
        try {
            OutputStream outputStream2 = (OutputStream) arrayList.get(0);
            try {
                qlg qlgVar = (qlg) this.a;
                qlgVar.getClass();
                omg omgVar = (omg) qlgVar;
                int iK = omgVar.k();
                boolean z = gmg.b;
                if (iK > 4096) {
                    iK = 4096;
                }
                dmg dmgVar = new dmg(outputStream2, iK);
                omgVar.d(dmgVar);
                if (dmgVar.e > 0) {
                    dmgVar.B();
                }
                m7h[] m7hVarArr2 = (m7h[]) this.b;
                if (m7hVarArr2 != null) {
                    m7h m7hVar2 = m7hVarArr2[0];
                    if (((jeh) m7hVar2.b) == null) {
                        throw new heh("Cannot sync underlying stream");
                    }
                    ((OutputStream) m7hVar2.a).flush();
                    ((jeh) m7hVar2.b).a.getFD().sync();
                }
                outputStream2.close();
                oehVar.e(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                oehVar.c(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    @Override // defpackage.r36
    public void i(Throwable th) {
        c8h c8hVar = (c8h) this.b;
        c8hVar.A0();
        w3h w3hVar = (w3h) c8hVar.b;
        boolean z = false;
        c8hVar.x = false;
        c8hVar.Y0().add((kbh) this.a);
        int i = 1;
        if (c8hVar.y > ((Integer) bzg.v0.a(null)).intValue()) {
            c8hVar.y = 1;
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.c(w0h.E0(w3hVar.l().G0()), w0h.E0(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        w0h w0hVar2 = w3hVar.f;
        w3h.h(w0hVar2);
        w0hVar2.x.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", w0h.E0(w3hVar.l().G0()), w0h.E0(String.valueOf(c8hVar.y)), w0h.E0(th.toString()));
        int i2 = c8hVar.y;
        e6h e6hVar = c8hVar.z;
        if (e6hVar == null) {
            e6hVar = new e6h(c8hVar, w3hVar, i, z);
            c8hVar.z = e6hVar;
        }
        e6hVar.b(((long) i2) * 1000);
        int i3 = c8hVar.y;
        c8hVar.y = i3 + i3;
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        reh rehVar = (reh) this.a;
        gle gleVar = (gle) this.b;
        synchronized (rehVar.f) {
            rehVar.e.remove(gleVar);
        }
    }

    public /* synthetic */ gsg(Object obj, Object obj2, boolean z) {
        this.a = obj2;
        this.b = obj;
    }

    public gsg(qlg qlgVar) {
        this.a = qlgVar;
    }

    public /* synthetic */ gsg(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
