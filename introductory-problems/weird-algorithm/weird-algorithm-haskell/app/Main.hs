module Main where

f :: Int -> [String]
f 1 = [show 1]
f n = show n : " " : f p
  where
    p = if even n then div n 2 else n * 3 + 1

main :: IO ()
main = do
  w <- getLine
  putStrLn (concat (f (read w)))
