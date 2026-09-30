package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cbh implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cbh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
                    sb.append("Received response to request: ");
                    sb.append(i);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                ech echVar = (ech) this.b;
                synchronized (echVar) {
                    try {
                        SparseArray sparseArray = echVar.e;
                        odh odhVar = (odh) sparseArray.get(i);
                        if (odhVar != null) {
                            sparseArray.remove(i);
                            echVar.d();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (odhVar.e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            odhVar.c(new seh("Invalid response to one way request", null));
                                        } else {
                                            odhVar.b(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        odhVar.b(bundle);
                                        break;
                                }
                            } else {
                                odhVar.c(new seh("Not supported by GmsCore", null));
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i);
                            b1.l("MessengerIpcClient", sb2.toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    tch tchVar = (tch) this.b;
                    synchronized (tchVar.a) {
                        try {
                            z9h z9hVar = (z9h) message.obj;
                            abh abhVar = (abh) tchVar.a.get(z9hVar);
                            if (abhVar != null && abhVar.a.isEmpty()) {
                                if (abhVar.c) {
                                    z9h z9hVar2 = abhVar.e;
                                    tch tchVar2 = abhVar.g;
                                    tchVar2.c.removeMessages(1, z9hVar2);
                                    tchVar2.d.c(tchVar2.b, abhVar);
                                    abhVar.c = false;
                                    abhVar.b = 2;
                                }
                                tchVar.a.remove(z9hVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                tch tchVar3 = (tch) this.b;
                synchronized (tchVar3.a) {
                    try {
                        z9h z9hVar3 = (z9h) message.obj;
                        abh abhVar2 = (abh) tchVar3.a.get(z9hVar3);
                        if (abhVar2 != null && abhVar2.b == 3) {
                            String strValueOf = String.valueOf(z9hVar3);
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 47);
                            sb3.append("Timeout waiting for ServiceConnection callback ");
                            sb3.append(strValueOf);
                            b1.e("GmsClientSupervisor", sb3.toString(), new Exception());
                            ComponentName componentName2 = abhVar2.f;
                            if (componentName2 == null) {
                                z9hVar3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                z9hVar3.getClass();
                                componentName = new ComponentName("com.google.android.gms", "unknown");
                            }
                            abhVar2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return true;
        }
    }
}
