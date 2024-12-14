module Main where

algo :: Int -> String
algo n = unwords (map show (g n))
  where
    g n = takeWhile (/= 1) (iterate f n) ++ [1]
      where
        f n = if even n then div n 2 else n * 3 + 1

main :: IO ()
main = do
  s <- getLine
  let n = read s :: Int
  putStrLn (algo n)
