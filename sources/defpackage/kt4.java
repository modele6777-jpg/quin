package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kt4 implements DefaultLifecycleObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public kt4(Context context) {
        this.b = context;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(x48 x48Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? ih2.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new mt4(0), 500L);
                ((h48) obj).b(this);
                break;
            default:
                x48Var.getClass();
                c38.a.e("Foreground resume → trigger legacy import");
                m8b m8bVar = w28.a;
                Context context = (Context) obj;
                context.getClass();
                w28.a(context);
                break;
        }
    }

    public kt4(EmojiCompatInitializer emojiCompatInitializer, h48 h48Var) {
        this.b = h48Var;
    }
}
