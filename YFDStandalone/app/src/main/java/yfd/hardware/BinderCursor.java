package yfd.hardware;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class BinderCursor {
    private BinderCursor() {
    }

    public static final class BinderParcelable implements Parcelable {
        public static final Parcelable.Creator<BinderParcelable> CREATOR = new Parcelable.Creator<BinderParcelable>() {
            @Override
            public BinderParcelable createFromParcel(Parcel in) {
                return new BinderParcelable(in);
            }

            @Override
            public BinderParcelable[] newArray(int size) {
                return new BinderParcelable[size];
            }
        };
        public IBinder mBinder;

        public BinderParcelable(IBinder binder) {
            this.mBinder = binder;
        }

        private BinderParcelable(Parcel in) {
            this.mBinder = in.readStrongBinder();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeStrongBinder(this.mBinder);
        }

        @Override
        public int describeContents() {
            return 0;
        }
    }
}
