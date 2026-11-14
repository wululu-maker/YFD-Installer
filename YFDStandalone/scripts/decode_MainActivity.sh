#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
DIR="$ROOT/app/src/main/java/com/ma/yfdinstaller"
OUT="$DIR/MainActivity.java"
cat "$DIR"/MainActivity.java.gz.b64.part{0,1,2,3,4,5,6,7} | base64 -d | gzip -d > "$OUT"
echo "Wrote $OUT ($(wc -c < "$OUT") bytes)"
