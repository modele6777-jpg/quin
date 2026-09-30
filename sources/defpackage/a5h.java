package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a5h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ech b;

    public /* synthetic */ a5h(ech echVar, int i) {
        this.a = i;
        this.b = echVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ech echVar = this.b;
                synchronized (echVar) {
                    if (echVar.a == 1) {
                        echVar.b("Timed out while binding");
                    }
                    break;
                }
                return;
            case 1:
                break;
            default:
                this.b.b("Service disconnected");
                return;
        }
        while (true) {
            ech echVar2 = this.b;
            synchronized (echVar2) {
                try {
                    if (echVar2.a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = echVar2.d;
                    if (arrayDeque.isEmpty()) {
                        echVar2.d();
                        return;
                    }
                    odh odhVar = (odh) arrayDeque.poll();
                    SparseArray sparseArray = echVar2.e;
                    int i = odhVar.a;
                    sparseArray.put(i, odhVar);
                    ((ScheduledExecutorService) echVar2.f.d).schedule(new n6h(echVar2, odhVar, false, 7), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(odhVar)));
                    }
                    veh vehVar = echVar2.f;
                    Messenger messenger = echVar2.b;
                    int i2 = odhVar.c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i2;
                    messageObtain.arg1 = i;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", odhVar.a());
                    bundle.putString("pkg", ((Context) vehVar.c).getPackageName());
                    bundle.putBundle("data", odhVar.d);
                    messageObtain.setData(bundle);
                    try {
                        gsg gsgVar = echVar2.c;
                        Messenger messenger2 = (Messenger) gsgVar.a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            cwg cwgVar = (cwg) gsgVar.b;
                            if (cwgVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            cwgVar.a.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        echVar2.b(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
