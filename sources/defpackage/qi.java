package defpackage;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.adjust.sdk.sig.r3;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qi extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0262  */
    /* JADX WARN: Code duplicated, block: B:146:0x026e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        nh0 nh0Var;
        ArrayDeque arrayDeque;
        int size;
        jgb[] jgbVarArr;
        boolean z = false;
        nh0 nh0Var2 = null;
        jSONObject = null;
        JSONObject jSONObject = null;
        nh0Var2 = null;
        nh0Var2 = null;
        nh0Var2 = null;
        nh0Var2 = null;
        nh0Var2 = null;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                oh0 oh0Var = (oh0) this.b;
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        nh0Var = (nh0) message.obj;
                        int i3 = nh0Var.a;
                        MediaCodec.CryptoInfo cryptoInfo = nh0Var.c;
                        long j = nh0Var.d;
                        int i4 = nh0Var.e;
                        try {
                            if (Build.VERSION.SDK_INT < 31) {
                                synchronized (oh0.v) {
                                    oh0Var.a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                                }
                            } else {
                                oh0Var.a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            }
                            break;
                        } catch (RuntimeException e) {
                            AtomicReference atomicReference = oh0Var.d;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i2 == 3) {
                        oh0Var.e.c();
                    } else if (i2 != 4) {
                        AtomicReference atomicReference2 = oh0Var.d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            oh0Var.a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference3 = oh0Var.d;
                            while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (nh0Var2 != null) {
                        arrayDeque = oh0.g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(nh0Var2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                nh0Var = (nh0) message.obj;
                try {
                    oh0Var.a.queueInputBuffer(nh0Var.a, 0, nh0Var.b, nh0Var.d, nh0Var.e);
                    break;
                } catch (RuntimeException e3) {
                    AtomicReference atomicReference4 = oh0Var.d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
                nh0Var2 = nh0Var;
                if (nh0Var2 != null) {
                    arrayDeque = oh0.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(nh0Var2);
                        return;
                    }
                }
                return;
            case 2:
                int i5 = message.what;
                if (i5 == 0) {
                    ((fb5) this.b).b.getClass();
                    if (db6.L0(4)) {
                        Log.i("MixpanelAPI.FeatureFlagManager", "Feature flags are disabled, not fetching.");
                        return;
                    }
                    return;
                }
                if (i5 != 1) {
                    db6.F("MixpanelAPI.FeatureFlagManager", "Unknown message type " + message.what);
                    return;
                }
                Bundle data = message.getData();
                int i6 = data.getInt("generation");
                if (i6 != ((fb5) this.b).n) {
                    StringBuilder sbN = ub3.n(i6, "Discarding flag fetch result from stale generation ", " (current ");
                    sbN.append(((fb5) this.b).n);
                    sbN.append(")");
                    db6.D("MixpanelAPI.FeatureFlagManager", sbN.toString());
                    return;
                }
                boolean z2 = data.getBoolean("success");
                String string = data.getString("responseJson");
                String string2 = data.getString("errorMessage");
                if (!z2 || string == null) {
                    z = z2;
                } else {
                    try {
                        z = z2;
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e4) {
                        db6.G("MixpanelAPI.FeatureFlagManager", "Could not parse response JSON string in completeFetch", e4);
                        string2 = "Failed to parse flags response JSON.";
                    }
                }
                if (!z && string2 != null) {
                    db6.h1("MixpanelAPI.FeatureFlagManager", "Flag fetch failed: ".concat(string2));
                }
                fb5 fb5Var = (fb5) this.b;
                db6.D("MixpanelAPI.FeatureFlagManager", "Completing fetch request. Success: " + z);
                ArrayList arrayList = fb5Var.k;
                fb5Var.k = new ArrayList();
                if (!z || jSONObject == null) {
                    db6.h1("MixpanelAPI.FeatureFlagManager", "Flag fetch failed or response missing/invalid. Keeping existing flags (if any).");
                } else {
                    try {
                        HashMap mapK = b21.K(jSONObject);
                        HashMap mapC = fb5.c(jSONObject);
                        fb5Var.b(mapK, mapC);
                        HashMap mapE = fb5.e(mapK);
                        synchronized (fb5Var.g) {
                            fb5Var.i = Collections.unmodifiableMap(mapE);
                            break;
                        }
                        fb5Var.l = mapC;
                        fb5Var.j.clear();
                        if (!(fb5Var.b.b instanceof esf) && fb5Var.h != null) {
                            fb5Var.f(jSONObject);
                        }
                        db6.f1("MixpanelAPI.FeatureFlagManager", "Flags updated: " + fb5Var.i.size() + " flags loaded, " + mapC.size() + " pending first-time events.");
                    } catch (Exception e5) {
                        db6.G("MixpanelAPI.FeatureFlagManager", "Unexpected error parsing flags response", e5);
                    }
                }
                if (arrayList.isEmpty()) {
                    db6.D("MixpanelAPI.FeatureFlagManager", "No fetch completion handlers to call.");
                    return;
                }
                db6.D("MixpanelAPI.FeatureFlagManager", "Calling " + arrayList.size() + " fetch completion handlers.");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        r3.f();
                        return;
                    }
                }
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                ja8 ja8Var = (ja8) this.b;
                do {
                    synchronized (ja8Var.a) {
                        try {
                            size = ja8Var.b.size();
                            if (size <= 0) {
                                return;
                            }
                            jgbVarArr = new jgb[size];
                            ja8Var.b.toArray(jgbVarArr);
                            ja8Var.b.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (size <= 0);
                jgb jgbVar = jgbVarArr[0];
                throw null;
        }
    }
}
